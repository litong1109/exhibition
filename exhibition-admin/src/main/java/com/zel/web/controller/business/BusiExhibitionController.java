package com.zel.web.controller.business;

import com.zel.business.domain.BusiExhibition;
import com.zel.business.domain.BusiProspect;
import com.zel.business.service.IBusiExhibitionService;
import com.zel.common.annotation.Log;
import com.zel.common.config.Global;
import com.zel.common.constant.UserConstants;
import com.zel.common.core.controller.BaseController;
import com.zel.common.core.domain.AjaxResult;
import com.zel.common.core.page.TableDataInfo;
import com.zel.common.enums.BusinessType;
import com.zel.common.utils.file.FileUploadUtils;
import com.zel.common.utils.poi.ExcelUtil;
import com.zel.framework.util.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Generated;
import java.util.List;

/**
 * @description:展会信息
 * @auther: andy
 * @date: 2020/11/02
 */
@Controller
@RequestMapping("/business/exhibition")
public class BusiExhibitionController extends BaseController
{
    private static final Logger log = LoggerFactory.getLogger(BusiExhibitionController.class);

    private String prefix = "business/exhibition";

    @Autowired
    private IBusiExhibitionService exhibitionService;

    @RequiresPermissions("business:exhibition:view")
    @GetMapping()
    public String exhibiton()
    {
        return prefix + "/exhibition";
    }

    /**
     * 新增展会
     */
    @GetMapping(value = "/add")
    public String add(){return prefix + "/add";}

    /**
     * 保存新增展会
     * @param exhibition 展会信息
     * @return
     */
    @RequiresPermissions(value = "business:exhibition:add")
    @Log(title = "展会管理",businessType = BusinessType.INSERT)
    @PostMapping(value = "/add")
    @ResponseBody
    public AjaxResult addSave(@Validated BusiExhibition exhibition){
        if (UserConstants.EXHIBITION_NAME_NOT_UNIQUE.equals(exhibitionService.checkExhibitionNameUnique(exhibition))) {
            return error("新增展会"+ exhibition.getExhibitionName() +"失败，展会名称已存在");
        }
        exhibition.setCreateBy(ShiroUtils.getLoginName());
        return toAjax(exhibitionService.insertExhibition(exhibition));
    }

    /**
     * 获取展会列表
     * @param exhibition 展会信息
     */
    @RequiresPermissions("business:exhibition:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusiExhibition exhibition) {
        startPage();
        List<BusiExhibition> list = exhibitionService.selectExhibitionList(exhibition);
        return getDataTable(list);
    }

    /**
     * 校验展会名称是否唯一
     */
    @PostMapping("/checkExhibitionNameUnique")
    @ResponseBody
    public String checkExhibitionNameUnique(BusiExhibition exhibition) {
        return exhibitionService.checkExhibitionNameUnique(exhibition);
    }

    /**
     *修改展会
     * @param exhibitionId
     */
    @GetMapping("/edit/{exhibitionId}")
    public String edit(@PathVariable("exhibitionId") Long exhibitionId, ModelMap mmap) {
        mmap.put("exhibition", exhibitionService.selectExhibitionById(exhibitionId));
        return prefix + "/edit";
    }

    /**
     * 保存修改展会信息
     * @param exhibition 展会信息
     */
    @RequiresPermissions("business:exhibition:edit")
    @Log(title = "保存修改展会",businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated BusiExhibition exhibition){
        if (UserConstants.EXHIBITION_NAME_NOT_UNIQUE.equals(exhibitionService.checkExhibitionNameUnique(exhibition))) {
            return error("新增展会"+exhibition.getExhibitionName()+"失败，展会名称已存在");
        }
        /*exhibition.setUpdateBy(ShiroUtils.getLoginName());*/
        exhibition.setUpdateBy(ShiroUtils.getUserId().toString());
        return toAjax(exhibitionService.updateExhibition(exhibition));
    }

    /**
     * 删除展会
     * @param ids 展会ID
     */
    @RequiresPermissions("business:exhibition:remove")
    @Log(title = "删除展会",businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult deleteExhibition(@Validated Long[] ids){
        return toAjax(exhibitionService.deleteExhibition(ids));
    }

    /**
     * 导出展会信息
     * @param exhibition
     */
    @RequiresPermissions("business:exhibition:export")
    @Log(title = "导出展会信息",businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult exportExhibition(@Validated BusiExhibition exhibition){
        List<BusiExhibition> list = exhibitionService.selectExhibitionList(exhibition);
        ExcelUtil<BusiExhibition> util = new ExcelUtil<>(BusiExhibition.class);
        return util.exportExcel(list,"展会数据");
    }

    /**
     * 勘展
     * @param exhibitionId 展会ID
     */
    @GetMapping(value = "/prospect/{exhibitionId}")
    public String prospect(@PathVariable("exhibitionId")Long exhibitionId,ModelMap map){
        map.put("prospect",exhibitionService.selectProspect(exhibitionId));
//        map.put("prospectUrlList",exhibitionService.selectProspect(exhibitionId).getProspectUrlList());
        return prefix + "/prospect";
    }

    /**
     * 保存勘展图片
     */
    @Log(title = "勘展图片", businessType = BusinessType.INSERT)
    @PostMapping("/saveProspectUrl")
    @ResponseBody
    public AjaxResult saveProspectUrl(@RequestParam(value = "files") MultipartFile[] files,@RequestParam(value = "exhibitionId") Long exhibitionId)
    {
        exhibitionService.deldetUrl(exhibitionId);
        try
        {
            for(MultipartFile file:files)
            {
                String prospectUrl = FileUploadUtils.upload(Global.getProspectUrlPath(), file);
                exhibitionService.insertProspectUrl(prospectUrl,exhibitionId);
            }
        }
        catch (Exception e)
        {
            log.error("保存勘展图片失败！", e);
            return error(e.getMessage());
        }
        return success();
    }






}
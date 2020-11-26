package com.zel.web.controller.business;

import com.zel.business.domain.BusiSend;
import com.zel.business.service.IBusiExhibitionService;
import com.zel.business.service.IBusiMaterialService;
import com.zel.business.service.IBusiSendService;
import com.zel.common.core.controller.BaseController;
import com.zel.common.core.domain.AjaxResult;
import com.zel.common.core.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:发货信息
 * @auther: andy
 * @date: 2020/11/20
 */
@Controller
@RequestMapping("/business/send")
public class BusiSendController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(BusiSendController.class);

    private String prefix = "/Business/send";

    @Autowired
    private IBusiSendService sendService;

    @Autowired
    private IBusiExhibitionService exhibitionService;

    @Autowired
    private IBusiMaterialService materialService;

    @RequiresPermissions("business:send:view")
    @GetMapping()
    public String send(){return prefix + "/send";}

    /**
     * 获取发货列表
     * @param send 发货信息
     */
    @RequiresPermissions("business:send:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusiSend send){
        startPage();
        List<BusiSend> list = sendService.selectSendList(send);
        return getDataTable(list);
    }

    /**
     * 新增发货
     * @param
     */
    @GetMapping(value = "/add")
    public String add(ModelMap mmap){
        mmap.put("exhibitionInfo", exhibitionService.selectExhibitionInfo());
        return prefix + "/add";
    }


    /**
     *查询发货物料明细
     * @param id
     */
     @GetMapping("/selectSendMaterialDetail/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        mmap.put("SendMaterialDetail", sendService.selectSendMaterialDetail(id));
        return prefix + "/sendMaterialDetail";
    }

    /**
     * 查询可添加物料列表
     * @param ids 已添加物料ID
     */
    @GetMapping({"/addMaterial/{ids}","/addMaterial"})
    public String addMaterial(@PathVariable(value = "ids",required = false) Long[] ids, ModelMap map){
        try {
            map.put("material",materialService.selectMaterial(ids));
        }catch (Exception e){
            e.getMessage();
        }

         return prefix + "/addMaterial";
    }





}

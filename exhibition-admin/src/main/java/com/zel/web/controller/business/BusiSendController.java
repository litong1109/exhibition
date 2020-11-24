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
        mmap.put("exhibitionIds", exhibitionService.selectExhibitionIdList());
        return prefix + "/add";
    }


    /**
     *查询发货物料明细
     * @param id
     */
     @GetMapping("/selectSendMaterialDetail/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap) {
        mmap.put("SendMaterialDetail", sendService.selectSendMaterialDetail(id));
        return prefix + "/sendMaterialDetail";
    }


    @PostMapping("/addMaterial")
    public String addMaterial(@RequestParam(value="ids",required=false)String[] ids){
//         map.put("material",materialService.selectMaterial(ids));
        System.out.println(ids);
         return prefix + "/addMaterial";
    }





}

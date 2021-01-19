package com.zel.web.controller.business;

import com.zel.business.domain.BusiReceive;
import com.zel.business.domain.BusiSend;
import com.zel.business.service.IBusiReceiveService;
import com.zel.business.service.IBusiSendService;
import com.zel.common.core.controller.BaseController;
import com.zel.common.core.domain.AjaxResult;
import com.zel.common.core.page.TableDataInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:收货
 * @auther: andy
 * @date: 2020/12/14
 */
@Controller
@RequestMapping("/business/receive")
public class BusiReceiveController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(BusiReceiveController.class);

    private String prefix = "business/receive";

    @Autowired
    private IBusiReceiveService receiveService;

    @Autowired
    private IBusiSendService sendService;

    @GetMapping()
    public String  receive(){return prefix +"/receive";}

    /**
     * 查询收货列表
     * @param receive
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusiReceive receive){
        startPage();
        List<BusiReceive> list = receiveService.selectReceiveList(receive);
        return getDataTable(list);
    }

    @GetMapping("/add")
    public String add(ModelMap mmp){
        mmp.put("logisticsInfo",receiveService.selectLogisticsInfo());
        return prefix + "/add";
    }

    /**
     * 查询已发货信息
     */
    @PostMapping("/sendInfo")
    @ResponseBody
    public AjaxResult sendInfo(@RequestParam(value = "logisticsNumber")String logisticsNumber ){
        List<BusiSend> list = receiveService.selectSendInfo(logisticsNumber);
        return null;
    }
}

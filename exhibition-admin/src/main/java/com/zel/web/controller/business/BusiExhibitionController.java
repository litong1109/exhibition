package com.zel.web.controller.business;

import com.zel.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description:展会信息
 * @auther: litong
 * @date: 2020/10/26 10:05
 */
@Controller
@RequestMapping("/business/exhibition")
public class BusiExhibitionController extends BaseController
{
    private String prefix = "business/exhibition";


    @RequiresPermissions("business:exhibition:view")
    @GetMapping()
    public String exhibiton()
    {
        return prefix + "/exhibition";
    }


}
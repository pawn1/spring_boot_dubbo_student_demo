package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import comqf.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能说明
 *
 * @author xwgg
 * @date 2020-12-06 18:31:56
 */
@Controller
@RequestMapping("/cls")
public class ClsController {

    @Reference
    private IClsService clsService;

    /**
     * 查询所有班级
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){

        List<Classes> list = clsService.list();
        model.addAttribute("clss", list);

        return "clslist";
    }
}

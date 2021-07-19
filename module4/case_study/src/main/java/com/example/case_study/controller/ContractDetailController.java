package com.example.case_study.controller;

import com.example.case_study.dto.ContractDetailDto;
import com.example.case_study.model.entity.AttachService;
import com.example.case_study.model.service.IAttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("contractDetail")

public class ContractDetailController {

    @Autowired
    IAttachService iAttachService;
    @GetMapping("")
    public String display(Model model){
        List<AttachService> attachServiceList=iAttachService.findAll();

        model.addAttribute("attachServiceList",attachServiceList);
        model.addAttribute("contractDetailDto",new ContractDetailDto());
        return "contractDetail/list";
    }

}

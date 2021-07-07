package com.example.case_study.controller;

import com.example.case_study.dto.ContractDto;
import com.example.case_study.model.entity.Contract;
import com.example.case_study.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;

    @GetMapping(value = {"","/search"})
    public String display(Model model , @PageableDefault(size = 5) Pageable pageable, @RequestParam Optional<String> search){
        String keyword="";
        if (search.isPresent()){
            keyword=search.get();
        }
        Page<Contract> contractPage=iContractService.findAll(pageable,keyword);
        model.addAttribute("contractPage",contractPage);
        model.addAttribute("keyword",keyword);
        return "contract/list";
    }

}

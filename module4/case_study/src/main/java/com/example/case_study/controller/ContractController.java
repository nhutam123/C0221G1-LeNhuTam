package com.example.case_study.controller;

import com.example.case_study.dto.ContractDto;
import com.example.case_study.model.entity.Contract;
import com.example.case_study.model.entity.Customer;
import com.example.case_study.model.entity.Employee;
import com.example.case_study.model.entity.Service;
import com.example.case_study.model.service.IContractService;
import com.example.case_study.model.service.ICustomerService;
import com.example.case_study.model.service.IEmployeeService;
import com.example.case_study.model.service.IServiceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    IServiceService iServiceService;
    @Autowired
    IEmployeeService iEmployeeService;

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
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("contractDto",new ContractDto());
        List<Customer> customerlist =iCustomerService.findAll();
        List<Employee> employeeList=iEmployeeService.findAll();
        List<Service> serviceList=iServiceService.findAll();
        model.addAttribute("customerlist",customerlist);
        model.addAttribute("employeeList",employeeList);
        model.addAttribute("serviceList",serviceList);
        return "contract/create";

    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("contractDto") ContractDto contractDto, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "contract/create";
        }
        Contract contract=new Contract();
        BeanUtils.copyProperties(contractDto,contract);
        iContractService.save(contract);
        return "redirect:/contract";
    }

}

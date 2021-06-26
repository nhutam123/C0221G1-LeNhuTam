package com.example.product.controller;

import com.example.product.dto.ProductDto;
import com.example.product.model.entity.Producer;
import com.example.product.model.entity.Product;
import com.example.product.model.service.IProducerService;
import com.example.product.model.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;
    @Autowired
    IProducerService iProducerService;
    @GetMapping(value = {"/","/search"})
    public String display( Model model, @PageableDefault(size = 5) Pageable pageable,
                          @RequestParam Optional<String> name){
        String keyword="";
        if (name.isPresent()){
            keyword=name.get();
        }
        Page<Product> products=iProductService.findAllByNameContaining(pageable,keyword);
        model.addAttribute("products",products);
        model.addAttribute("keyword",keyword);

        return "index";
    }
    @GetMapping("/create")
    public String showCreateForm( Model model){
        model.addAttribute("productDto",new ProductDto());
        List<Producer>  list=iProducerService.findAll();
        model.addAttribute("listProducer",list);
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("productDto") ProductDto productDto, BindingResult bindingResult,
                         Model model){

        if (bindingResult.hasFieldErrors()){
            return "create";
        }else {
            Product product=new Product() ;
            BeanUtils.copyProperties(productDto,product);
            iProductService.save(product);
            return "redirect:/";
        }

    }
    @GetMapping("/edit")
    public String showEditForm(@RequestParam Integer id,Model model){
        Product product=iProductService.findById(id);
        model.addAttribute("product",product);
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product){
        iProductService.save(product);
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String showDeleteForm(@RequestParam Integer id,Model model){
        Product product=iProductService.findById(id);
        model.addAttribute("product",product);
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam Integer id){
        iProductService.delete(id);
        return "redirect:/";
    }
}

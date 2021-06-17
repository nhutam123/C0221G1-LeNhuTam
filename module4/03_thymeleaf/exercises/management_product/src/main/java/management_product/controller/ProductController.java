package management_product.controller;

import management_product.model.bean.Product;
import management_product.service.iProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private iProductService productService;
    @RequestMapping("")
    public String showList(Model model){
        List<Product> list=productService.findAll();
        model.addAttribute("products",list);
        return "index";
    }
    @RequestMapping("product/create")
    public  String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("product/save")
    public String save(Product product){
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        return "redirect:/";
    }
    @PostMapping("product/delete")
    public String delete(int id){
        productService.delete(id);

        return "redirect:/";
    }
    @GetMapping("product/test")
    public String test(){
        return "test";
    }



}

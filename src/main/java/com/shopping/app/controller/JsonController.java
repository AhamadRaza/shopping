package com.shopping.app.controller;

import com.shopping.app.model.Product;
import com.shopping.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JsonController {
    @Autowired private ProductService productService;

    @GetMapping("/allproduts")
    @ResponseBody
    public List<Product> productList(Model model){
        model.addAttribute("cmd", new Product());
        return productService.listActiveProducts();
    }


    @GetMapping("/allprodutsByCategory/{id}")
    @ResponseBody
    public List<Product> productListByCatgory(@PathVariable long id, Model model){
        model.addAttribute("cmd1", new Product());
        return productService.listActiveProductByCategory(id);
    }
}
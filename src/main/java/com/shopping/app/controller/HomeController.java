package com.shopping.app.controller;

import com.shopping.app.model.Category;
import com.shopping.app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired private CategoryService categoryService;

    @RequestMapping(value = {"/","/home","/index"})
    public String home(Model model) {
        List<Category> category = categoryService.list();
        model.addAttribute("category", category);
        return "view/home";
    }

    @RequestMapping(value = "/about")
    public String about(Model model) {
        model.addAttribute("cmd", "welcome to home page");
        return "view/about";
    }

    @RequestMapping(value = "/contact")
    public String contact(Model model) {
        model.addAttribute("cmd", "welcome to home page");
        return "view/contact";
    }

    @RequestMapping(value = "/listProducts")
    public String allProducts(Model model) {
        List<Category> category = categoryService.list();
        model.addAttribute("category", category);
        return "view/listProduct";
    }

    @RequestMapping(value = "/productbyid/{id}")
    public String showProductByCategoryId(@PathVariable long id, Model model) {
        Category categor = categoryService.byid(id);
        model.addAttribute("categor", categor);
        return "view/listProduct";
    }
}
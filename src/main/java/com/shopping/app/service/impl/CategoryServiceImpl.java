package com.shopping.app.service.impl;

import com.shopping.app.model.Category;
import com.shopping.app.repository.CategoryRepository;
import com.shopping.app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired private CategoryRepository categoryRepository;

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category = new Category();
        category.setId(1);
        category.setName("abc");
        category.setDescription("scsjcbs");
        category.setImageUrl("img.png");

        categories.add(category);


        Category category1 = new Category();
        category1.setId(2);
        category1.setName("kkjk");
        category1.setDescription("scsjcbs");
        category1.setImageUrl("img.png");

        categories.add(category1);

    }
    @Override
    public List<Category> list() {
        return categories;
    }

    @Override
    public Category byid(long id) {
        for(Category category : categories){
            if(category.getId()==id)
                return category;
        }
        return null;
    }
}
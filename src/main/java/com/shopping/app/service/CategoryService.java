package com.shopping.app.service;

import com.shopping.app.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> list();
    public Category byid(long id);
}
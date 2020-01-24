package com.shopping.app.service;

import com.shopping.app.model.Product;

import java.util.List;

public interface ProductService {
    public Product get(long id);
    public List<Product> list();
    public List<Product> listActiveProducts();
    public List<Product> listActiveProductByCategory(long categoryId);
    public List<Product> getLatestProucts(long count);
}
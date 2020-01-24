package com.shopping.app.service.impl;

import com.shopping.app.model.Product;
import com.shopping.app.repository.ProductRepository;
import com.shopping.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductRepository productRepository;
    @Override
    public Product get(long id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<Product> list() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> listActiveProducts() {
       return productRepository.listActiveProducts();
    }

    @Override
    public List<Product> listActiveProductByCategory(long categoryId) {
        return productRepository.listActiveProductByCategory(categoryId);
    }

    @Override
    public List<Product> getLatestProucts(long count) {
        return null;
    }
}
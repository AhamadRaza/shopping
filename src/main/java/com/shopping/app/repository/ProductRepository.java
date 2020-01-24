package com.shopping.app.repository;

import com.shopping.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from  Product p where p.active=true")
    public List<Product> listActiveProducts();

/*@Query("select an from Product an where an.app.id=?1 and an.user in " +
        "(select user from UserRoles where role in (?2) and isDeleted =false) order by an.id desc")*/

    @Query("select  p from Product p where p.categoryId.id=?1 and p.active=true")
    public List<Product> listActiveProductByCategory(long categoryId);
}
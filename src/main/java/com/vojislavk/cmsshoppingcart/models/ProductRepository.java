package com.vojislavk.cmsshoppingcart.models;

import java.util.List;

import com.vojislavk.cmsshoppingcart.models.data.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findBySlug(String slug);

    Product findBySlugAndIdNot(String slug, int id);
    
    Page<Product> findAll(Pageable pagable);

    List<Product> findAllByCategoryId(String categoryId, Pageable pageable);

    long countByCategoryId(String categoryId);
    
}
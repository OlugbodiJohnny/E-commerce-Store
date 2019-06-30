package com.vojislavk.cmsshoppingcart.models;

import com.vojislavk.cmsshoppingcart.models.data.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    
}
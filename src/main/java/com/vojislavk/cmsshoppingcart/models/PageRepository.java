package com.vojislavk.cmsshoppingcart.models;

import com.vojislavk.cmsshoppingcart.models.data.Page;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Integer> {

    Page findBySlug(String slug);

}
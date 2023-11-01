package com.jessicaarf.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicaarf.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

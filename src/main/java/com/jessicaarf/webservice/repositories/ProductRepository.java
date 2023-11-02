package com.jessicaarf.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicaarf.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

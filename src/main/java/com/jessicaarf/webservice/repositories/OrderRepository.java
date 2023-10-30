package com.jessicaarf.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicaarf.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.jessicaarf.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessicaarf.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

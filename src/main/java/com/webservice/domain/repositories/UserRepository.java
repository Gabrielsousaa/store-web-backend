package com.webservice.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.domain.entitites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

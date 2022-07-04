package com.webservice.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.domain.entitites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

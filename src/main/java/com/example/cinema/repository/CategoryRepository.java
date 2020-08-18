package com.example.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Category;

/**
 * Class represents Category Repository
 * @author j.a.vasconcelos
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}

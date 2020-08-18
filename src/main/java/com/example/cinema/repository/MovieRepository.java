package com.example.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entity.Movie;

/**
 * This class represents Movie repository
 * @author j.a.vasconcelos
 *
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

}

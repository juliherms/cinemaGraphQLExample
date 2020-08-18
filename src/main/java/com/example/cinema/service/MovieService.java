package com.example.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cinema.entity.Movie;
import com.example.cinema.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;

	/**
	 * This method responsible to return movie.
	 * 
	 * @return
	 */
	public Movie findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	/**
	 * This method responsible to return list of movie
	 * 
	 * @return
	 */
	public List<Movie> findAll() {

		return repo.findAll();
	}

	/**
	 * Method responsible to save movie
	 * 
	 * @param id
	 * @param name
	 * @param email
	 * @return
	 */
	@Transactional
	public Movie save(Movie m) {
		return repo.save(m);
	}

	/**
	 * Method responsible to delete movie by id.
	 * 
	 * @param id
	 * @return
	 */
	@Transactional
	public Boolean deleteById(Long id) {
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}

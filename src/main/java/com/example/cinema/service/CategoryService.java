package com.example.cinema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cinema.entity.Category;
import com.example.cinema.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;

	/**
	 * This method responsible to return category.
	 * 
	 * @return
	 */
	public Category findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	/**
	 * This method responsible to return list of category
	 * 
	 * @return
	 */
	public List<Category> findAll() {

		return repo.findAll();
	}

	/**
	 * Method responsible to save category
	 * 
	 * @param id
	 * @param name
	 * @param email
	 * @return
	 */
	@Transactional
	public Category save(Category c) {
		return repo.save(c);
	}

	/**
	 * Method responsible to delete category by id.
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

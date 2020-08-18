package com.example.cinema.graphql;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.cinema.dto.CategoryDTO;
import com.example.cinema.entity.Category;
import com.example.cinema.service.CategoryService;

/**
 * Component responsible to implement GraphQL Interface.
 * 
 * @author j.a.vasconcelos
 *
 */
@Component
public class CategoryGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private CategoryService service;

	/**
	 * This method responsible to return product.
	 * 
	 * @return
	 */
	public Category category(Long id) {

		return service.findById(id);
	}

	/**
	 * This method responsible to return list of product
	 * 
	 * @return
	 */
	public List<Category> categories() {

		return service.findAll();
	}

	/**
	 * Method responsible to save product
	 * 
	 * @param id
	 * @param name
	 * @param email
	 * @return
	 */
	public Category saveCategory(CategoryDTO category) {
		
		ModelMapper m = new ModelMapper();
		Category c = m.map(category,Category.class);
		
		return service.save(c);
	}

	/**
	 * Method responsible to delete product by id.
	 * 
	 * @param id
	 * @return
	 */
	public Boolean deleteCategory(Long id) {
		return service.deleteById(id);
	}
}

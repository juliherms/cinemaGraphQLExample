package com.example.cinema.graphql;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.cinema.dto.MovieDTO;
import com.example.cinema.entity.Movie;
import com.example.cinema.service.MovieService;

/**
 * Component responsible to implement GraphQL Interface.
 * 
 * @author j.a.vasconcelos
 *
 */
@Component
public class MovieGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private MovieService service;

	/**
	 * This method responsible to return client.
	 * 
	 * @return
	 */
	public Movie movie(Long id) {

		return service.findById(id);
	}

	/**
	 * This method responsible to return list of client
	 * 
	 * @return
	 */
	public List<Movie> movies() {

		return service.findAll();
	}

	/**
	 * Method responsible to save client
	 * 
	 * @param id
	 * @param name
	 * @param email
	 * @return
	 */
	public Movie saveMovie(MovieDTO movie) {
		
		ModelMapper mm = new ModelMapper();
		Movie m = mm.map(movie,Movie.class);
		
		return service.save(m);
	}

	/**
	 * Method responsible to delete client by id.
	 * 
	 * @param id
	 * @return
	 */
	public Boolean deleteMovie(Long id) {
		return service.deleteById(id);
	}
}

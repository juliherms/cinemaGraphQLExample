package com.example.cinema.graphql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.cinema.entity.Movie;

/**
 * Class responsible to resolver object Buy for GraphQL
 * @author j.a.vasconcelos
 *
 */
@Component
public class MovieResolver implements GraphQLResolver<Movie> {

	public String name(Movie m) {
		return m.getName();
	}
}

package co.edu.unilibre.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.rest.dto.MovieDto;

@RestController 
public class MovieController {
	@RequestMapping(value = "/moda", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	
	public List<MovieDto> allModa()
	{
		List<MovieDto> moda = new ArrayList<>();
		
		MovieDto moda1 = new MovieDto("moda 60´s",1960);
		MovieDto moda2 = new MovieDto("moda 70´s",1970);
		MovieDto moda3 = new MovieDto("moda 80´s",1980);
		MovieDto moda4 = new MovieDto("moda 90´s",1990);
		MovieDto moda5 = new MovieDto("actual",2019);
		
		moda.add(moda1);
		moda.add(moda2);
		moda.add(moda3);
		moda.add(moda4);
		moda.add(moda5);
		
		return moda;
	}
}

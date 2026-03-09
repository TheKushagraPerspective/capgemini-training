package com.capg.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.dao.MovieNotFoundException;
import com.capg.springboot.entities.Movie;
import com.capg.springboot.service.MovieServicel;

@RestController
@RequestMapping(value="movie")

//Connecting ... to Angular 
//@CrossOrigin("http://localhost:4200")
//@CrossOrigin("http://localhost:3000")
public class MovieController {
	@Autowired
    private MovieServicel service;
	
	
	@PostMapping(path="/add")
	public ResponseEntity<Boolean> addMovie(@RequestBody Movie movie) {
		service.AddMovie(movie);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	
	@GetMapping(path="/getdetails/{mId}")
	public ResponseEntity<Movie> findMovieById(@PathVariable("mId") long mId) {
		Movie emp=service.findMovieById(mId);
		if (emp == null) {
            throw new MovieNotFoundException("movie not found for id=" + mId);
        }
		return new ResponseEntity<Movie>(emp,new HttpHeaders(),HttpStatus.OK);
	}
	// http://localhost:9999/employee/getAll
	//@RequestMapping(value="employee")
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Movie>> findAll(){
		List<Movie> list=service.findAllMovies();
		
		return new ResponseEntity<List<Movie>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<Movie> updateEmployee(@RequestBody Movie movie){
		movie=service.updateMovie(movie);
		return new ResponseEntity<Movie>(movie,new HttpHeaders(),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/delete/{mId}")
	public String deleteEmployee(@PathVariable("mId") Long mId) {
		service.deleteMovie(mId);
		return "Deleted";
	}
}

package com.ds.movies.controller;

import com.ds.movies.service.MovieService;
import com.ds.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.allMovies(),HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public  ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id){
        return new ResponseEntity<>(movieService.movie(id),HttpStatus.OK);
    }

}

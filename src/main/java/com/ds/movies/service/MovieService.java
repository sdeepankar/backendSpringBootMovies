package com.ds.movies.service;

import com.ds.movies.model.Movie;
import com.ds.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return  movieRepository.findAll();
    }

    public Optional<Movie> movie(String id){
        return movieRepository.findMovieByImdbId(id);
    }
}

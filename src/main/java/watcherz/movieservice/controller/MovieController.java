package watcherz.movieservice.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watcherz.movieservice.exceptions.CouldNotRetrieveMoviesException;
import watcherz.movieservice.exceptions.MovieListIsEmptyException;
import watcherz.movieservice.model.Movie;
import watcherz.movieservice.service.MovieService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Movie>> getAllMoviesByUserId(@PathVariable("id") String id) throws CouldNotRetrieveMoviesException, MovieListIsEmptyException {
        return new ResponseEntity<>(movieService.getAllMoviesByUserId(id), HttpStatus.OK);
    }
}

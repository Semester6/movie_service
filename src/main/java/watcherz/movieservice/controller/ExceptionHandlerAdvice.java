package watcherz.movieservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import watcherz.movieservice.exceptions.CouldNotRetrieveMoviesException;
import watcherz.movieservice.exceptions.MovieListIsEmptyException;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler
    public ResponseEntity<String> handleCouldNotRetrieveMoviesException(CouldNotRetrieveMoviesException e) {
        log.error("Could not retrieve movies", e);
        return new ResponseEntity<>("Could not retrieve movies", HttpStatus.CONFLICT);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleMovieListIsEmptyException(MovieListIsEmptyException e) {
        log.error("MovieList is empty", e);
        return new ResponseEntity<>("MovieList is empty", HttpStatus.CONFLICT);
    }
}

package watcherz.movieservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import watcherz.movieservice.exceptions.CouldNotRetrieveMoviesException;
import watcherz.movieservice.exceptions.MovieListIsEmptyException;
import watcherz.movieservice.model.Movie;
import watcherz.movieservice.repository.MovieListRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieListRepository movieListRepository;

    public List<Movie> getAllMoviesByUserId(String id) throws CouldNotRetrieveMoviesException, MovieListIsEmptyException {
        List<Movie> movies = new ArrayList<>();
        try {
           movies = movieListRepository.findMoviesByUserId(id);
        }
        catch (Exception e) {
            throw new CouldNotRetrieveMoviesException();
        }
        if(movies.isEmpty()){
            throw new MovieListIsEmptyException();
        }
        return movies;
    }
}

package watcherz.movieservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import watcherz.movieservice.model.Movie;

import java.util.List;

public interface MovieListRepository extends MongoRepository<Movie, String> {
    public List<Movie> findMoviesByUserId(String userId);
}

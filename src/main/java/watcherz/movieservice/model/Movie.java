package watcherz.movieservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class Movie {

    @Getter @Setter
    public String movieId;
    @Getter @Setter
    public String name;
    @Getter @Setter
    public String userId;
    @Getter @Setter
    public MovieStatus status;
}

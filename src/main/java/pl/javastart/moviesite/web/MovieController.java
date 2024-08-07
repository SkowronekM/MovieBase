package pl.javastart.moviesite.web;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import pl.javastart.moviesite.domain.movie.MovieService;
import pl.javastart.moviesite.domain.movie.dto.MovieDto;
import pl.javastart.moviesite.domain.rating.RatingService;

import java.util.List;

@Controller
public class MovieController {
    private final MovieService movieService;
    private final RatingService ratingService;

    public MovieController(MovieService movieService, RatingService ratingService) {
        this.movieService = movieService;
        this.ratingService = ratingService;
    }

    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable long id, Model model, Authentication authentication) {
        MovieDto movie = movieService.findMovieById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("movie", movie);

        // if user authenticated
        if (authentication != null) {
            String currentUserEmail = authentication.getName();
            // find vote
            Integer rating = ratingService.getUserRatingForMovie(currentUserEmail, id).orElse(0);
            model.addAttribute("userRating", rating);
        }

        return "movie";
    }

    @GetMapping("/top10")
    public String findTop10(Model model) {
        List<MovieDto> top10Movies = movieService.findTopMovies(10);
        model.addAttribute("heading", "Top10 movies");
        model.addAttribute("description", "Videos best rated by users");
        model.addAttribute("promotedMovies", top10Movies);
        return "movie-listing";
    }
}

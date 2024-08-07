package pl.javastart.moviesite.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.moviesite.domain.movie.MovieService;
import pl.javastart.moviesite.domain.movie.dto.MovieDto;

import java.util.List;

@Controller
public class HomeController {
    private final MovieService movieService;

    public HomeController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    String home(Model model) {
        List<MovieDto> allPromotedMovies = movieService.findAllPromotedMovies();
        model.addAttribute("heading", "Promoted videos");
        model.addAttribute("description", "Videos recommended by our team");
        model.addAttribute("promotedMovies", allPromotedMovies);
        return "movie-listing";
    }
}

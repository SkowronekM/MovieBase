package pl.javastart.moviesite.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import pl.javastart.moviesite.domain.genre.GenreService;
import pl.javastart.moviesite.domain.genre.dto.GenreDto;
import pl.javastart.moviesite.domain.movie.MovieService;
import pl.javastart.moviesite.domain.movie.dto.MovieDto;

import java.util.List;

@Controller
public class GenreController {
    private final GenreService genreService;
    private final MovieService movieService;

    public GenreController(GenreService genreService, MovieService movieService) {
        this.genreService = genreService;
        this.movieService = movieService;
    }

    @GetMapping("/genre/{name}")
    public String getGenre(@PathVariable String name, Model model) {
        GenreDto genreDto = genreService.findGenreByName(name).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        List<MovieDto> movies = movieService.findMoviesByGenreName(name);

        model.addAttribute("heading", genreDto.getName());
        model.addAttribute("description", genreDto.getDescription());
        model.addAttribute("promotedMovies", movies);

        return "movie-listing";
    }

    @GetMapping("/movie-genres")
    public String getGenreList(Model model) {
        List<GenreDto> allGenres = genreService.findAllGenres();
        model.addAttribute("genres", allGenres);
        return "genre-listing";
    }
}

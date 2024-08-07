package pl.javastart.moviesite.domain.movie;

import pl.javastart.moviesite.domain.movie.dto.MovieDto;
import pl.javastart.moviesite.domain.rating.Rating;

public class MovieDtoMapper {

    static MovieDto map(Movie movie) {
        double avgRating = movie.getRatings().stream()
                .map(Rating::getRating)
                .mapToDouble(val -> val)
                .average().orElse(0);
        int ratingCount = movie.getRatings().size();
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getOriginalTitle(),
                movie.getShortDescription(),
                movie.getDescription(),
                movie.getYoutubeTrailerId(),
                movie.getReleaseYear(),
                movie.isPromoted(),
                movie.getPoster(),
                movie.getGenre().getName(),
                avgRating,
                ratingCount
        );
    }
}

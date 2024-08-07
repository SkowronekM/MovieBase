package pl.javastart.moviesite.domain.genre;

import pl.javastart.moviesite.domain.genre.dto.GenreDto;

public class GenreDtoMapper {

    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}

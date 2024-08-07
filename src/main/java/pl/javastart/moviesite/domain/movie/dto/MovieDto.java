package pl.javastart.moviesite.domain.movie.dto;

public class MovieDto {
    private Long id;
    private String title;
    private String originalTitle;
    private String shortDescription;
    private String description;
    private String youtubeTrailerId;
    private Integer releaseYear;
    private boolean promoted;
    private String poster;
    private String genre;
    private double avgRating;
    private int ratingCount;

    public MovieDto(Long id, String title, String originalTitle, String shortDescription, String description, String youtubeTrailerId, Integer releaseYear, boolean promoted, String poster, String genre, double avgRating, int ratingCount) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.shortDescription = shortDescription;
        this.description = description;
        this.youtubeTrailerId = youtubeTrailerId;
        this.releaseYear = releaseYear;
        this.promoted = promoted;
        this.poster = poster;
        this.genre = genre;
        this.avgRating = avgRating;
        this.ratingCount = ratingCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYoutubeTrailerId() {
        return youtubeTrailerId;
    }

    public void setYoutubeTrailerId(String youtubeTrailerId) {
        this.youtubeTrailerId = youtubeTrailerId;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
}

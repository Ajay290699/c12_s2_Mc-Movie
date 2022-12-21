package org.niit.domain;

public class Movie {

    private String movieName;
    private String genre;
    private String cast;
    private String releaseDate;
    private double budget;

    private double rating;

    private String director;

    public Movie() {
    }

    public Movie(String movieName, String genre, String cast, String releaseDate, double budget, double rating, String director) {
        this.movieName = movieName;
        this.genre = genre;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.rating = rating;
        this.director = director;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                ", cast='" + cast + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", budget=" + budget +
                ", rating=" + rating +
                ", director='" + director + '\'' +
                '}';
    }
}

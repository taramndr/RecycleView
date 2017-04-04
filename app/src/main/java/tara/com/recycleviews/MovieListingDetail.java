package tara.com.recycleviews;

/**
 * Created by Tara on 03-Apr-17.
 */

public class MovieListingDetail {

    private String movieName;
    private int moviePosterPath;

    //Create Constructor
    public  MovieListingDetail(String movieName, int moviePosterPath){
        this.movieName = movieName;
        this.moviePosterPath = moviePosterPath;
    }

    public int getMoviePosterPath() {
        return moviePosterPath;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMoviePosterPath(int moviePosterPath) {
        this.moviePosterPath = moviePosterPath;
    }
}

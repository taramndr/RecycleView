package tara.com.recycleviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovieLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       rvMovieLayout = (RecyclerView) findViewById(R.id.rv_exmp_view);

        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this); // it says recycle view to be Linear List
        //rvMovieLayout.setLayoutManager(linearLayoutManager);

        //GridLayoutManager gridLayoutManager =  new GridLayoutManager(this, 2);
        //rvMovieLayout.setLayoutManager(gridLayoutManager);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rvMovieLayout.setLayoutManager(staggeredGridLayoutManager);

        rvMovieLayout.setAdapter(new MovieListingAdapter(getMovieList()));

        getMovieListing();
    }

    public ArrayList<MovieListingDetail> getMovieList() {
        ArrayList<MovieListingDetail> movieList = new ArrayList<>();
        movieList.add(new MovieListingDetail("Lusy", R.drawable.lusy2));
        movieList.add(new MovieListingDetail("The Illusionist", R.drawable.illlusionist2));
        movieList.add(new MovieListingDetail("Frozen", R.drawable.frozen2));
        movieList.add(new MovieListingDetail("Imperium", R.drawable.imperium2));
        movieList.add(new MovieListingDetail("Whip lash", R.drawable.whiplash2));
        return movieList;
    }

    public void getMovieListing(){

    }
}


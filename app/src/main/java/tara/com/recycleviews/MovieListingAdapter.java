package tara.com.recycleviews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tara on 03-Apr-17.
 */

public class MovieListingAdapter extends RecyclerView.Adapter<MovieListingAdapter.MovieViewHolder>{

    private ArrayList<MovieListingDetail> movieListingDetailArrayList;

    public MovieListingAdapter(ArrayList<MovieListingDetail> movieListingDetailArrayList){
        this.movieListingDetailArrayList = movieListingDetailArrayList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {  //return viewholder as view
        View layoutView;
        layoutView = LayoutInflater.from(parent.getContext()). inflate(R.layout.movie_listing, parent, false);
        MovieViewHolder rvh = new MovieViewHolder(layoutView);
        return rvh;
        //return null;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.ivMoviePoster.setImageResource(movieListingDetailArrayList.get(position).getMoviePosterPath());
        holder.tvMovieName.setText(movieListingDetailArrayList.get(position).getMovieName());

    }


    @Override
    public int getItemCount() {
        return movieListingDetailArrayList.size();
        //return 0;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivMoviePoster;
        public TextView tvMovieName;

        public MovieViewHolder(View layoutView) {
            super(layoutView);
            ivMoviePoster = (ImageView) layoutView.findViewById(R.id.iv_movie_poster);
            tvMovieName = (TextView) layoutView.findViewById(R.id.tv_movie_name);
        }
    }
}

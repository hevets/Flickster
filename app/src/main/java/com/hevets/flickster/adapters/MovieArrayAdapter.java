package com.hevets.flickster.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hevets.flickster.R;
import com.hevets.flickster.models.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.hevets.flickster.R.id.tvOverview;
import static com.hevets.flickster.R.id.tvTitle;

/**
 * Created by hevets on 3/6/17.
 */

public class MovieArrayAdapter extends ArrayAdapter<Movie> {

    // ViewHolder Pattern (improves speed)
    private static class ViewHolder {
        TextView title;
        TextView overview;
        ImageView imageView;
    }

    public MovieArrayAdapter(Context context, List<Movie> movies) {
        super(context, R.layout.item_movie, movies);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the data item for position
        Movie movie = getItem(position);

        ViewHolder viewHolder;

        // check if the existing view is being reused
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_movie, parent, false); // don't attach it

            viewHolder.title = (TextView)convertView.findViewById(tvTitle);
            viewHolder.overview = (TextView)convertView.findViewById(tvOverview);
            viewHolder.imageView = (ImageView)convertView.findViewById(R.id.ivMovieImage);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Use the ViewHolder to populate each view
        viewHolder.title.setText(movie.getOriginalTitle());
        viewHolder.overview.setText(movie.getOverview());

        String imageViewPath;

        if (getContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            imageViewPath = movie.getPosterPath();
            Picasso.with(getContext())
                    .load(imageViewPath)
                    .placeholder(R.mipmap.loading_image)
                    .resize(400, 0)
                    .into(viewHolder.imageView);
        } else {
            imageViewPath = movie.getBackdropPath();
            Picasso.with(getContext())
                    .load(imageViewPath)
                    .placeholder(R.mipmap.loading_image)
                    .resize(0, 500)
                    .into(viewHolder.imageView);
        }

        return convertView;
    }
}

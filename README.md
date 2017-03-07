# Flickster
CodePath Week 1 - Flickster App


### User Stories

- [x] User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API. (5 points)
- [x] Lists should be fully optimized for performance using the ViewHolder pattern to cache view lookups within the adapter. (2 points)
- [ ] Views should be responsive for both landscape/portrait mode. (3 points)

##### Optional

- [ ] Display a nice default placeholder graphic for each image during loading (read more about Picasso)
- [ ] Improve the user interface through styling and coloring
- [ ] For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous ListViews and use different ViewHolder layout files for popular movies and less popular ones. 
- [ ] Stretch: Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [ ] Stretch: Allow video posts to be played in full-screen using the YouTubePlayerView
  - [ ] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [ ] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
  - [ ] See the videos API for video information. Here's a sample request.
- [ ] Stretch: Add a play icon overlay to popular movies to indicate that the movie can be played
- [ ] Stretch: Apply the popular ButterKnife annotation library to reduce view boilerplate.
- [ ] Stretch: Add a rounded corners for the images using the Picasso transformations.
- [ ] Stretch: Replace android-async-http network client with the popular OkHttp networking library for all TheMovieDB API calls.

### Notes

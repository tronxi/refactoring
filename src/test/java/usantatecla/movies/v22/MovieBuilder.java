package usantatecla.movies.v22;

public class MovieBuilder {

	public static final String DEFAULT_MOVIE_NAME = "movieName";

	private String title;

	private Movie movie;

	public MovieBuilder() {
		title = MovieBuilder.DEFAULT_MOVIE_NAME;
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public MovieBuilder childrens() {
		this.movie = new ChildrenMovie(title);
		return this;
	}
	
	public MovieBuilder regular() {
		this.movie = new RegularMovie(title);
		return this;
	}
	
	public MovieBuilder newRelease() {
		this.movie = new NewReleaseMovie(title);
		return this;
	}
	
	public Movie build() {
		return movie;
	}
}

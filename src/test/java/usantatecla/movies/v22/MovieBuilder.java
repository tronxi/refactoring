package usantatecla.movies.v22;

public class MovieBuilder {

	private String title;

	private Price price;

	private Movie movie;

	public MovieBuilder() {
		title = "movieName";
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public MovieBuilder childrens() {
		this.price = new ChildrenPrice();
		this.movie = new ChildrenMovie(title, price);
		return this;
	}
	
	public MovieBuilder regular() {
		this.price = new RegularPrice();
		this.movie = new RegularMovie(title, price);
		return this;
	}
	
	public MovieBuilder newRelease() {
		this.price = new NewReleasePrice();
		this.movie = new NewReleaseMovie(title, price);
		return this;
	}
	
	public Movie build() {
		return movie;
	}
}

package usantatecla.movies.v22;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class CustomerTest {

	@Test
	public void frequentWithoutRentalsTest() {
		Customer customer = new CustomerBuilder().build();
		assertEquals(0, customer.getTotalFrequentRenterPoints());
	}

	@Test
	public void chargeWithoutRentalsTest() {
		Customer customer = new CustomerBuilder().build();
		assertThat(0.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentRegularRental1DayTest() {
		Movie movie = new MovieBuilder().regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeRegularRental1DayTest() {
		Movie movie = new MovieBuilder().regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(2.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentRegularRental2DayTest() {
		Movie movie = new MovieBuilder().regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeRegularRental2DayTest() {
		Movie movie = new MovieBuilder().regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(2.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentRegularRental3DayTest() {
		Movie movie = new MovieBuilder().regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeRegularRental3DayTest() {
		Movie movie = new MovieBuilder().regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(3.5, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentNewReleaseRental1DayTest() {
		Movie movie = new MovieBuilder().newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeNewReleaseRental1DayTest() {
		Movie movie = new MovieBuilder().newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(3.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentNewReleaseRental2DayTest() {
		Movie movie = new MovieBuilder().newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(2, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeNewReleaseRental2DayTest() {
		Movie movie = new MovieBuilder().newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(3.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentNewReleaseRental3DayTest() {
		Movie movie = new MovieBuilder().newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(2, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeNewReleaseRental3DayTest() {
		Movie movie = new MovieBuilder().newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(3.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentChildrensRental1DayTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeChildrensRental1DayTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1.5, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentChildrensRental3DayTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeChildrensRental3DayTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1.5, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentChildrensRental4DayTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(1, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeChildrensRental4DayTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		Customer customer = new CustomerBuilder().rental(rental).build();
		assertThat(6.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void frequentRentalTest() {
		String regularMovieName = "regularMovieName";
		Movie regularMovie = new MovieBuilder().title(regularMovieName).regular().build();
		Rental regularRental = new RentalBuilder().movie(regularMovie).daysRented(10).build();

		String newReleaseMovieName = "newReleaseMovieName";
		Movie newReleaseMovie = new MovieBuilder().title(newReleaseMovieName).newRelease().build();
		Rental newReleaseRental = new RentalBuilder().movie(newReleaseMovie).daysRented(10).build();

		String childrensMovieName = "childrensMovieName";
		Movie childrensMovie = new MovieBuilder().title(childrensMovieName).childrens().build();
		Rental childrensRental = new RentalBuilder().movie(childrensMovie).daysRented(10).build();

		Customer customer = new CustomerBuilder()
				.rental(regularRental).rental(newReleaseRental).rental(childrensRental).build();

		assertThat(4, is(equalTo(customer.getTotalFrequentRenterPoints())));
	}

	@Test
	public void chargeRentalTest() {
		String regularMovieName = "regularMovieName";
		Movie regularMovie = new MovieBuilder().title(regularMovieName).regular().build();
		Rental regularRental = new RentalBuilder().movie(regularMovie).daysRented(10).build();

		String newReleaseMovieName = "newReleaseMovieName";
		Movie newReleaseMovie = new MovieBuilder().title(newReleaseMovieName).newRelease().build();
		Rental newReleaseRental = new RentalBuilder().movie(newReleaseMovie).daysRented(10).build();

		String childrensMovieName = "childrensMovieName";
		Movie childrensMovie = new MovieBuilder().title(childrensMovieName).childrens().build();
		Rental childrensRental = new RentalBuilder().movie(childrensMovie).daysRented(10).build();

		Customer customer = new CustomerBuilder()
				.rental(regularRental).rental(newReleaseRental).rental(childrensRental).build();

		assertThat(32.0, is(equalTo(customer.getTotalCharge())));
	}

	@Test
	public void statementTest() {
		Movie movie = new MovieBuilder().childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		Customer customer = new CustomerBuilder().rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().movie( 6)
				.totalAmount(6).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}
	
	
}

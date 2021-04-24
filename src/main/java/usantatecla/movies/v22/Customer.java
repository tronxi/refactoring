package usantatecla.movies.v22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Customer {

	private String name;
	
	private List<Rental> rentals;

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<Rental>();
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		String rentalResult = this.perform(rental -> "\t" + rental.getMovieTitle() + "\t" + rental.getCharge() + "\n",
				strings -> String.join("", strings));

		return new StringBuilder()
				.append("Rental Record for ")
				.append(this.getName())
				.append("\n")
				.append(rentalResult)
				.append("Amount owed is ")
				.append(this.getTotalCharge())
				.append("\n")
				.append("You earned ")
				.append(this.getTotalFrequentRenterPoints())
				.append(" frequent renter points")
				.toString();
	}

	private double getTotalCharge() {
		return this.perform(Rental::getCharge,
				charges -> charges.stream().reduce(0.0, Double::sum));
	}
	
	private int getTotalFrequentRenterPoints() {
		return this.perform(Rental::getFrequentRenterPoints,
				frequentRenterPoints -> frequentRenterPoints.stream().reduce(0, Integer::sum));
	}

	private <T> T perform(Function<Rental, T> map, Function<List<T>, T> reduce) {
		List<T> result = new ArrayList<>();
		for(Rental rental : this.rentals) {
			result.add(map.apply(rental));
		}
		return reduce.apply(result);
	}

}

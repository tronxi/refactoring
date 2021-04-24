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
		Iterator<Rental> rentals = this.rentals.iterator();
		String result = "Rental Record for " + this.getName() + "\n";

		result += this.perform(rental -> "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n",
				strings -> String.join("", strings));

		result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
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

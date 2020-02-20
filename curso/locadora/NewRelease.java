package curso.locadora;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title);
	}

	@Override
	public double getAmount(int daysRented) {	
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRrnted) {
		if (daysRrnted > 1)
			return 2;
		return 1;
	}
	
	

}

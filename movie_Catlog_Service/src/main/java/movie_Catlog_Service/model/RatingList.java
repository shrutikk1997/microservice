package movie_Catlog_Service.model;

import java.util.List;

public class RatingList {

	private List<Rating> rating;

	
	
    public RatingList() {	
	}
	
	public RatingList(List<Rating> rating) {
		
		this.rating = rating;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
	
	
}

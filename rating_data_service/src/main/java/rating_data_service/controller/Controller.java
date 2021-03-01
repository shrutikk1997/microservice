package rating_data_service.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rating_data_service.model.Rating;
import rating_data_service.model.RatingList;

@RestController
@RequestMapping("/rating")
public class Controller {

	
//	@GetMapping("/{movieID}")
//	public List< Rating>  getRating(@PathVariable("movieID")String movieid)
//	{
//		List<Rating> l1=new ArrayList<Rating>();
//		l1.add(new Rating("1",4));
//		l1.add(new Rating("2",5));
//		return l1;
//	
//	}
//	
	@GetMapping("/getMovieRating")
	public RatingList getRating()
	{
		List<Rating> l1=new ArrayList<Rating>();
		l1.add(new Rating("1",4));
		l1.add(new Rating("2",5));
	
		RatingList r=new RatingList(l1);
		return r;
	
	}
}

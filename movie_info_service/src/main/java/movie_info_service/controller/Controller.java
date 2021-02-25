package movie_info_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import movie_info_service.model.Movie;

@RestController
@RequestMapping("/movie_Info")
public class Controller {

	@GetMapping("/getMovieInfo")
	public   Movie getMovie()
	{
//		 List<Movie> l1=new ArrayList<>();
//		l1.add(snew Movie("1","pk"));
		//l1.add(new Movie("2","timepass"));	
		return new Movie("1","pk");
		
		
	}
	
	
	
}

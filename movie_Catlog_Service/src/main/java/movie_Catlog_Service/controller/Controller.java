package movie_Catlog_Service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import movie_Catlog_Service.model.CatLogItem;
import movie_Catlog_Service.model.Movie;
import movie_Catlog_Service.model.Rating;
import movie_Catlog_Service.model.RatingList;


@RestController
@RequestMapping("/catlog")
public class Controller {
	
	@Autowired
	RestTemplate resttemplate;
	//WebClient.Builder webclient=new WebClient.Builder();


	@GetMapping("/getList")
	public List<CatLogItem>   getCatlog()
	{
	
		Movie l1= resttemplate.getForObject("http://localhost:8082/movie_Info/getMovieInfo",Movie.class);
          System.out.println(l1.toString());      	
      	
      	String s=l1.getMovieId();
      	System.out.println(s);
      	String name=l1.getMovieName();
      	System.out.println(name);
      	
//      	List<Rating> l2=new ArrayList<Rating>();
//		l2.add(new Rating("1",4));
//		l2.add(new Rating("2",5));

      RatingList r=	resttemplate.getForObject("http://localhost:8083/rating/getMovieRating", RatingList.class);
      
		 List<CatLogItem>  l3=new ArrayList<>();
	      l3.add(new CatLogItem(s,"desc",	r.getRating().get(0).getRating()));
		return l3;
	
	}
	

}

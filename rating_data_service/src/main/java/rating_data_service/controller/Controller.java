package rating_data_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class Controller {

	@GetMapping("/{movieID}")
	public int getRating(@PathVariable("movieID")String movieid)
	{
		return 2;
	}
}

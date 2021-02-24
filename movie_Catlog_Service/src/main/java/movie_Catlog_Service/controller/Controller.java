package movie_Catlog_Service.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import movie_Catlog_Service.model.CatLogItem;

@RestController
@RequestMapping("/catlog")
public class Controller {
	
	@GetMapping("/getList")
	public List<CatLogItem>   getCatlog()
	{
		return Collections.singletonList(new  CatLogItem("pk","abc",55419));	
	}
	

}

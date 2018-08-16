package com.simplilearn.pjspringboot.demo.dbconnection;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//https://spring.io/guides/gs/accessing-data-mysql/
//https://dzone.com/articles/using-mysql-jdbc-driver-with-spring-boot


@RestController
@RequestMapping(path="/dbdemo") 
public class ElearningController2 {
	
	@Autowired
	private ElearningRepository elearningRepository;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Elearning> getAllElearnings() {
		// This returns a JSON or XML with the users
		return elearningRepository.findAll();
	}
	
	@GetMapping(path="/findById")
	public @ResponseBody Optional<Elearning> getOneElearning(@RequestParam String id) {
		return elearningRepository.findById(Integer.parseInt(id));
	}
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewElearning (@RequestParam String name
			, @RequestParam String description) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Elearning e = new Elearning();
		e.setName(name);
		e.setDescription(description);
		elearningRepository.save(e);
		return "Saved";
	}
	
}

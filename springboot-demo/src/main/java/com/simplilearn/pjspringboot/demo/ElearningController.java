package com.simplilearn.pjspringboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElearningController {
	
	@Autowired
	private ElearningService elearningService;

//	@RequestMapping("/elearnings")
//	public String getAllElearnings() {
//		return "all relearnings";
//	}
	
//	@RequestMapping("/elearnings")
//	public List<Elearning> getAllElearnings() {
//		return Arrays.asList(
//					new Elearning(123,"Java","Java Basic"),
//					new Elearning(345,"JavaScript","JavaScript Basic"),
//					new Elearning(121,"PHP","PHP Basic")
//				);	
//	}
	
	@RequestMapping("/elearnings")
	public List<Elearning> getAllElearnings() {
		return elearningService.getAllElearnings();
	}
	
	@RequestMapping("/elearnings/{id}")
//	@RequestMapping("/elearnings/{foo}")
//	public Elearning getElearning(@PathVariable("foo") int id) {
	public Elearning getElearning(@PathVariable int id) {
		return elearningService.getElearning(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/elearnings")
	public void addElearning(@RequestBody Elearning elearning) {
		elearningService.addElearning(elearning);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/elearnings/{id}")
	public void updateElearning(@RequestBody Elearning elearning, @PathVariable int id) {
		elearningService.addElearning(id, elearning);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/elearnings/{id}")
	public void deleteElearning(@PathVariable int id) {
		elearningService.deleteElearning(id);
	}
}

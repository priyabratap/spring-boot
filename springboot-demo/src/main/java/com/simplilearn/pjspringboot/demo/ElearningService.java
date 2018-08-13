package com.simplilearn.pjspringboot.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ElearningService {
	
//	private List<Elearning> elearnings = Arrays.asList( //immutable
//			new Elearning(123,"Java","Java Basic"),
//			new Elearning(345,"JavaScript","JavaScript Basic"),
//			new Elearning(121,"PHP","PHP Basic")
//		);	
	private List<Elearning> elearnings = new ArrayList<>(Arrays.asList(
			new Elearning(123,"Java","Java Basic"),
			new Elearning(345,"JavaScript","JavaScript Basic"),
			new Elearning(121,"PHP","PHP Basic")
		));	
	
	public List<Elearning> getAllElearnings(){
		return elearnings;
	}
	
	public Elearning getElearning(int id) {
		return elearnings.stream().filter(e -> e.getId()== id).findFirst().get();
	}

	public void addElearning(Elearning elearning) {
		elearnings.add(elearning);
	}

	public void addElearning(int id, Elearning elearning) {
		for(int i=0; i< elearnings.size(); i++) {
			Elearning e = elearnings.get(i);
			if(e.getId() == id) {
				elearnings.set(i, elearning);
				return;
			}
		}
	}

	public void deleteElearning(int id) {
		elearnings.removeIf(e -> e.getId() == id);
	}

}

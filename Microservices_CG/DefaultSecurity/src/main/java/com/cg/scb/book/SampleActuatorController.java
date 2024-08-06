package com.cg.scb.book;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleActuatorController {

	@GetMapping("/map")
	public Map<String,Integer> getMapObject() {
		return Map.of("ABC", 444, "FGH", 555);
	}
}

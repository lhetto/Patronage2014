package com.blstream.szczecin.kisiel.boleslaw.zad2.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blstream.szczecin.kisiel.boleslaw.zad2.model.BKPerson;

@Controller
@RequestMapping("/api")
public class BKJSONControler {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	// , params = "person")
	public @ResponseBody
	BKPerson getPersonInJSON(
			@RequestParam(value = "person", required = false, defaultValue = "World") String person) {

		System.out.println("Got request param: " + person);

		BKPerson managedPerson = new BKPerson();
		managedPerson.setMessage("Hello, " + person + "!");

		return managedPerson;

	}

}

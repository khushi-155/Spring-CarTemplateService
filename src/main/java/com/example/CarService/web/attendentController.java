package com.example.CarService.web;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 1. getAttendent method returns string "attendent" for Attendent page.
 2. Also, it accepts attendentId of type String and object of type ModelMap as argument.
 3. Use @PathVariable annotation accordingly.
**/

@Controller
public class attendentController {
    
  @GetMapping("/attendent/{attendentId}")
    public String getAttendent(@PathVariable("attendentId") String id,ModelMap map){
      //Write your Logic here
	  HashMap<String ,Object> attendent = new HashMap<>();
	  attendent.put("name", "Test 123");
	  attendent.put("id", id);
	  attendent.put("specility","Engine,BodyShop");
	  ArrayList<HashMap<String ,Object>>attendentList = new ArrayList<>();
	  attendentList.add(attendent);
	  map.addAttribute("list",attendentList);
      return "attendent";
    }

}

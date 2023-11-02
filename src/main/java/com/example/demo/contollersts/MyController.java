package com.example.demo.contollersts;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;


@Controller
public class MyController {
	
	
	
	
	
	
	@RequestMapping("/")
	String myfun(Model m)
	{
		
		
		
	List<Student> list = new ArrayList<>();
	list.add(new Student(101, "Nayan", "nandanvan"));
	list.add(new Student(102, "roshan", "mankapur"));
	
	
		
		m.addAttribute("obj",list);
		
		
		return "page1.html";
	}

}

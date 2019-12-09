package com.wildcodeschool.myProject.com.wildcodeschool.myProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	
	
	@RequestMapping("/")
	@ResponseBody
		
	public String index() {
		String drList;
		drList = "<h1>The doctors list:</h1>"
				+ "<ul>"
				+ "<li><a href='/doctor/1'>Wiliam Harnell<a/></li>"
				+ "<li><a href='/doctor/2'>Patrick Troughton<a/></li>"
				+ "<li><a href='/doctor/3'>Jon Pertwee<a/></li>"
				+ "<li><a href='/doctor/4'>Tom Baker<a/></li>"
				+ "</ul>";
		return drList;
	}
	
	

	@RequestMapping("/doctor/1")
	@ResponseBody
		
	public String index2() {
		return "Wiliam Harnell";
	}
	
	
	
	@RequestMapping("/doctor/2")
	@ResponseBody
		
	public String index3() {
		return "Patrick Troughton";
	}
	
	
	@RequestMapping("/doctor/3")
	@ResponseBody
		
	public String index4() {
		return "Jon Pertwee";
	}
	
	@RequestMapping("/doctor/4")
	@ResponseBody
		
	public String index5() {
		return "Tom Baker";
	}
	
	
	
	
	
	
}

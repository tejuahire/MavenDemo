package com.example.Dao;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@RequestMapping("/")
public String home(){
return "NewFile";
}
	

//	@RequestMapping("add")
//public String add(@RequestParam("num1") int i,@RequestParam("num2")int j,HttpSession session){
//		int num3=i+j;
//		session.setAttribute("num3", num3);
//return "result.jsp";
//}
	
//	@RequestMapping("sub")
//public ModelAndView sum(@RequestParam("num1") int i,@RequestParam("num2")int j,HttpSession session){
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("sub");
//		int num3=i-j;
//		mv.addObject("num3",num3);
//return mv;
//}
	
//	@RequestMapping("sub")
//	public String mul(@RequestParam("num1") int i,@RequestParam("num2")int j,ModelMap m){ //Model or ModelMap
//
//			int num3=i-j;
//			m.addAttribute("num3",num3);
//	return "sub";
//	}
	
//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("aid") int aid,@RequestParam("anme") String aname,Model m){ //Model or ModelMap
//		Alien a=new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		m.addAttribute("alien", a);
//		return "result1";
//	}
//	
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute Alien a,Model m){ //Model or ModelMap
//		
//		m.addAttribute("alien",a);
//		return "result1";
//	}
	
//	@RequestMapping("addAlien")
//	public String addAlien( Alien a)
//	{	
//		return "result1";		
//	}
	
//	@ModelAttribute
//	public void modeldata(Model m) {
//		m.addAttribute("name", "Aliens");
//	}
	
//	@Autowired
//	private AlienDao dao;
	
//	@GetMapping("getAliens")
//	public String getAlienModel(Model m) {
//		m.addAttribute("result",dao.getAliens());
//		return "showAliens";
//	}
	
	@Autowired
	AlienRepo repo;
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		
		m.addAttribute("result", repo.findAll());
		return "showAliens";
		
	}
	
@PostMapping(value="addAlien")
public String addAlien(@ModelAttribute Alien a) {
	repo.save(a);
	return "result1";
}
	
 @PostMapping(value="deleteAlien")
public String deleteAlien(@ModelAttribute Alien a) {
	repo.delete(a);;
	return "result1";
}
 
	@GetMapping("getAlienbyname")
	public String getAlienbyname(@RequestParam String aname, Model m)
	{
		
		m.addAttribute("result", repo.findbyname(aname));
		return "showAliens";
		
	}
}

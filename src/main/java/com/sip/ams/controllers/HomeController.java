package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Candidat;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	//@ResponseBody
	public String home()
	{
		//return "<h2>Bienvenue au BootCamp</h2>";
		return "home/index";
	}
	
	@RequestMapping("/candidats")
	public String listCandidats(Model m)
	{
		Candidat c1 = new Candidat(1,"Naouel","naouel@gmail.com","11111111");
		Candidat c2 = new Candidat(2,"Sameh","samed@gmail.com","22222222");
		Candidat c3 = new Candidat(3,"Amine","amine@gmail.com","33333333");
		Candidat tab[]=new Candidat[3];
		tab[0]=c1;
		tab[1]=c2;
		tab[2]=c3;
		String libelleFormation ="Spring Boot & Angular";
		String formateur = "Mohamed Amine Mezghich";
		
		m.addAttribute("lf", libelleFormation);
		m.addAttribute("coach", formateur);
		m.addAttribute("tab", tab);
		return "home/candidats";
	}
	
	@GetMapping("/add")
	//@ResponseBody
	public String addCandidate()
	{
		return "home/add";
	}

}

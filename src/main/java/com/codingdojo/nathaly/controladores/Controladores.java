package com.codingdojo.nathaly.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.nathaly.modelos.Lista;

import com.codingdojo.nathaly.servicios.Servicios;

@Controller
public class Controladores {
	@Autowired
	private Servicios servicio;
	
	@GetMapping("/")
	public String Home() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Lista>lista= servicio.findLista(); 
		model.addAttribute("lista", lista); 
		return "dashboard.jsp";
	}
	
	@GetMapping("/songs/new")
	public String nuevaCancion(@ModelAttribute("lista")Lista cancion) {
		return "new.jsp";
	}
	@PostMapping("/new")
	public String agregarCancion(@Valid @ModelAttribute("lista")Lista nuevaCancion, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			servicio.saveLista(nuevaCancion);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/mostrar/{id}")
	public String showCancion(@PathVariable("id")Long id, Model model) {
		Lista cancion=servicio.findLista(id);
		model.addAttribute("lista", cancion);
		return "mostrar.jsp";
	}
	
	

}

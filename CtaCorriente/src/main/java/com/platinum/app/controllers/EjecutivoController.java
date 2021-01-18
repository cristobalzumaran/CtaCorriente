package com.platinum.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.platinum.app.models.entity.Ejecutivo;
import com.platinum.app.service.EjecutivoService;

@Controller
@RequestMapping(value = "/ejecutivos")
@SessionAttributes("ejecutivo")
public class EjecutivoController {

	@Autowired
	private EjecutivoService ejecutivoService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {

		model.addAttribute("titulo", "Listado de ejecutivos");
		model.addAttribute("ejecutivos", ejecutivoService.findAll());
		return "ejecutivos";
	}

	@RequestMapping(value = "form")
	public String crear(Map<String, Object> model) {
		model.put("titulo", "Formulario de Ejecutivos");
		Ejecutivo ejecutivo = new Ejecutivo();
		model.put("ejecutivo", ejecutivo);

		return "form";
	}

	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String guardar(@Valid Ejecutivo ejecutivo, BindingResult result, Model model,SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Ejecutivos");

			return "form";
		}
		ejecutivoService.save(ejecutivo);
		status.setComplete();
		return "redirect:listar";
	}

	@RequestMapping(value = "/form/{id}")
	public String editar(@PathVariable(value = "id") int id, Map<String, Object> model) {
		Ejecutivo ejecutivo = null;
		if (id > 0) {
			ejecutivo = ejecutivoService.findOne(id);

		} else {
			return "redirect:/listar";
		}
		model.put("titulo", "Formulario de Editar Ejecutivos");
		model.put("ejecutivo", ejecutivo);
		return "form";

	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") int id) {
		if (id > 0) {
			 ejecutivoService.delete(id);
		} 
		
		return "redirect:/listar";

	}
}

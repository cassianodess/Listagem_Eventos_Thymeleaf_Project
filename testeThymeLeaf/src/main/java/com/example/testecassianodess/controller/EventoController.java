package com.example.testecassianodess.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.testecassianodess.model.Evento;
import com.example.testecassianodess.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository repo;

	@GetMapping(value = "/cadastrarEvento") // requisição de onde virá o form
	public String form() {
		return "evento/formEvento"; // Diretório onde se encontra o arquivo destino
	}

	@PostMapping(value = "/cadastrarEvento")
	public String form(Evento evento) {
		repo.save(evento);
		return "redirect:/cadastrarEvento";
	}

	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		// Passa a página que será renderizada no caso, index
		ModelAndView mv = new ModelAndView("index");
		ArrayList<Evento> eventos = (ArrayList<Evento>) repo.findAll();
		// (nome referenciado no form, objeto lista)
		mv.addObject("eventos", eventos);
		return mv;
	}

}

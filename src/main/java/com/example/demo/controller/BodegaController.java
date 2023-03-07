package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.service.IBodegaService;

@RequestMapping("/bodegas")
@Controller
public class BodegaController {

	@Autowired
	private IBodegaService bodegaService;

		@GetMapping("/nuevaBodega")
		public String paginaNuevaBodega(Bodega bodega) {

			return "vistaNuevaBodega";
		}

		@PostMapping("/insertar")
		public String InsertarBodega(Bodega bodega) {
			this.bodegaService.crear(bodega);
			return "guardado";
		}


}

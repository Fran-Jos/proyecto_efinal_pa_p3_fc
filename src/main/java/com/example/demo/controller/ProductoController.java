package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@RequestMapping("/productos")
@Controller
public class ProductoController {

	@Autowired
	private IProductoService iProductoService;

		@GetMapping("/nuevoProducto")
		public String paginaNuevoProducto(Producto producto) {

			return "vistaNuevoProducto";
		}

		@PostMapping("/insertar")
		public String InsertarProducto(Producto producto) {
			this.iProductoService.crear(producto);
			return "guardadoProducto";
		}


}

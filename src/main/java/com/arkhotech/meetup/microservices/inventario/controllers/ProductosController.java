package com.arkhotech.meetup.microservices.inventario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arkhotech.meetup.microservices.inventario.model.Producto;
import com.arkhotech.meetup.microservices.inventario.repositories.ProductosCrudRepository;
import com.arkhotech.meetup.microservices.inventario.repositories.ProductosJpaRepository;

@Controller
@RequestMapping(path="/inventario")
public class ProductosController {

	@Autowired
	private ProductosCrudRepository productosCrudRepository;
	
	@Autowired
	ProductosJpaRepository productosJpaRepository;

	/**
	 * Retorna todos los productos existentes en la base de datos
	 * @return JSon String
	 */
	@GetMapping(path="/")
	public @ResponseBody Iterable<Producto> listAllProducts() {
		return productosCrudRepository.findAll();
	}

	/**
	 * Retorna todos los productos de la base de datos que estén
	 * asociados al idCategoría
	 * @param idCategoria
	 * @return JSon String
	 */
	@GetMapping(path="/categoria/{idCategoria}")
	public @ResponseBody Iterable<Producto> listAllProductsByCategory(@PathVariable Integer idCategoria) {
		return productosJpaRepository.findByCategory(idCategoria);
	}
	
	/**
	 * Retorna la información de un producto según su id
	 * @param idProducto
	 * @return
	 */
	@GetMapping(path="/{idProducto}")
	public @ResponseBody Producto getProduct(@PathVariable Integer idProducto) {
		return productosCrudRepository.findOne(idProducto);
	}

	
}

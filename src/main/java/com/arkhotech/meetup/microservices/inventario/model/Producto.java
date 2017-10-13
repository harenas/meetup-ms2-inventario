package com.arkhotech.meetup.microservices.inventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="id_categoria")
	private Integer idCategoria;
	
	private String nombre;
	
	@Column(name="precio_normal")
	private Integer precioNormal;
	
	@Column(name="precio_premium")
	private Integer precioPremium;
	
	private Integer stock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecioNormal() {
		return precioNormal;
	}

	public void setPrecioNormal(Integer precioNormal) {
		this.precioNormal = precioNormal;
	}

	public Integer getPrecioPremium() {
		return precioPremium;
	}

	public void setPrecioPremium(Integer precioPremium) {
		this.precioPremium = precioPremium;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	
}

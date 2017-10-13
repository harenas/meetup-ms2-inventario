package com.arkhotech.meetup.microservices.inventario.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arkhotech.meetup.microservices.inventario.model.Producto;

public interface ProductosJpaRepository extends JpaRepository<Producto, Integer> {
	@Query("select p from Producto p where p.idCategoria = ?1")
	List<Producto> findByCategory(Integer idCategoria);
}

package com.arkhotech.meetup.microservices.inventario.repositories;

import org.springframework.data.repository.CrudRepository;

import com.arkhotech.meetup.microservices.inventario.model.Producto;

public interface ProductosCrudRepository extends CrudRepository<Producto, Integer> {

}

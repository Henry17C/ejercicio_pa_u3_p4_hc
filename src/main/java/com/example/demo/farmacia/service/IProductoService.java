package com.example.demo.farmacia.service;

import java.math.BigDecimal;

import com.example.demo.farmacia.repository.modelo.Producto;

public interface IProductoService {

	
	
	public void registrarProducto(String codigoBarras, String nombre, String categoria, Integer stock,  BigDecimal precio);
	
	
	public void insertar(Producto producto);

	
}

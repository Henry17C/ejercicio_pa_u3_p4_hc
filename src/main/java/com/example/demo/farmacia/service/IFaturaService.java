package com.example.demo.farmacia.service;

import java.util.List;

import com.example.demo.farmacia.repository.modelo.Factura;
import com.example.demo.farmacia.repository.modelo.Producto;
import com.example.demo.farmacia.repository.modelo.ProductoSimple;

public interface IFaturaService {
	
	
public void buscar(Integer Id);
	
	public void insertar(Factura factura);
	
	
	
	
	public void facturar(List<ProductoSimple> productos, String cedula);
	
	
	
	
	
	
	
	
	

}

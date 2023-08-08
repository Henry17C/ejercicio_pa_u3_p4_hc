package com.example.demo.farmacia.repository;

import com.example.demo.farmacia.repository.modelo.Factura;

public interface IFacturaRepo {
	
	

	public void actualiza(Factura factura);
	
	public void buscar(Integer Id);
	
	public void insertar(Factura factura);
	

}

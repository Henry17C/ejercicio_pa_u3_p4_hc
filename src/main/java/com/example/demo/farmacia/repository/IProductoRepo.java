package com.example.demo.farmacia.repository;

import java.util.List;

import com.example.demo.farmacia.repository.modelo.Producto;

public interface IProductoRepo {
	
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public Producto buscarCodi(String codigo);
	public Producto buscarId(Integer id);
	public List<Producto> buscarTodos();
	
	
	

}

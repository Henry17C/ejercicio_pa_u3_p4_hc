package com.example.demo.farmacia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farmacia.repository.IProductoRepo;
import com.example.demo.farmacia.repository.modelo.Producto;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ProductoServiceImpl implements IProductoService {

	
	@Autowired 
	private IProductoRepo iProductoRepo;
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public void registrarProducto(String codigoBarras, String nombre, String categoria, Integer stock,  BigDecimal precio) {
		Producto producto= new Producto();

		
		
		
		
			producto.setCategoria(categoria);
			producto.setCodigoBarras(codigoBarras);
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			producto.setStock(stock);
		try {
			
			Integer cantActual=producto.getStock();
			 producto= this.iProductoRepo.buscarCodi(codigoBarras);
			 producto.setStock(cantActual+stock);
			iProductoRepo.actualizar(producto);
			
			
		} catch (Exception e) {
		
			
			iProductoRepo.insertar(producto);
		}
		
		
		
		
		
		
		
		
	}

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.insertar(producto);
	}

}

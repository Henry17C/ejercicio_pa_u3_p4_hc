package com.example.demo.farmacia.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farmacia.repository.IProductoRepo;
import com.example.demo.farmacia.repository.modelo.Factura;
import com.example.demo.farmacia.repository.modelo.Producto;
import com.example.demo.farmacia.repository.modelo.ProductoSimple;

@Service
public class FacturaServiceImpl implements IFaturaService {

	@Autowired 
	private IProductoRepo iProductoRepo;
	
	@Override
	public void buscar(Integer Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void facturar(List<ProductoSimple> productos, String cedula) {
		
		
	List<Producto> prductosDB= iProductoRepo.buscarTodos();
		
    for (ProductoSimple productoSimpl : productos) {
		
    	
    	for (Producto producto : prductosDB) {
    		
    		if(producto.getCodigoBarras().equals(productoSimpl.getCodigoBarras()) && producto.getStock()>= productoSimpl.getCatidad() ) {
    			Integer canatAc= producto.getStock();
    			producto.setStock(canatAc-productoSimpl.getCatidad());
    			iProductoRepo.actualizar(producto);
    			System.out.println(producto);
    		}
			
		}
	}
	
	


		        
	
	}
	
	
	
	

}

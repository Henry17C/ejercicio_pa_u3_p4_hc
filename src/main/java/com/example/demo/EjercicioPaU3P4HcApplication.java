package com.example.demo;

import java.math.BigDecimal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.farmacia.service.IProductoService;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class EjercicioPaU3P4HcApplication  implements CommandLineRunner{
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(EjercicioPaU3P4HcApplication.class);
@Autowired 
IProductoService iProductoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//String codigoBarras, String nombre, String categoria, Integer stock,  BigDecimal precio
	
		//1. INSERTAR PROD
		iProductoService.registrarProducto("123", "Pastilla", "A", 12, new BigDecimal(12));
		
		iProductoService.registrarProducto("123", "Pastilla", "A", 12, new BigDecimal(12));
		
		
		
		
		
		
		
	}

}

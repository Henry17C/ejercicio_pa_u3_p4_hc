package com.example.demo.farmacia.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.farmacia.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class IFacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		entityManager.persist(factura);
	}

	@Override
	public void actualiza(Factura factura) {
		// TODO Auto-generated method stub
		entityManager.merge(factura);
	}

	@Override
	public void buscar(Integer Id) {
		// TODO Auto-generated method stub
		entityManager.find(Factura.class, Id);
	}
	


}

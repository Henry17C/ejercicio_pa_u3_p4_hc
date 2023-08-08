package com.example.demo.farmacia.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.farmacia.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		entityManager.persist(producto);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		entityManager.merge(producto);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Producto buscarCodi(String codigo) {
		// TODO Auto-generated method stub
		
		TypedQuery<Producto> query= this.entityManager.createQuery("select p from Producto p where p.codigoBarras= :codigo",Producto.class);
		query.setParameter("codigo", codigo);
		
		return query.getSingleResult();
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Producto buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Producto> buscarTodos() {
		TypedQuery<Producto> query= this.entityManager.createQuery("select p from Producto p",Producto.class);
		return query.getResultList();
	}

}

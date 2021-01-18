package com.platinum.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.platinum.app.models.entity.Ejecutivo;

@Repository
public class EjecutivoDaoImpl implements IEjecutivoDao {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Ejecutivo> findAll() {
		return em.createQuery(" from Ejecutivo").getResultList();
	}

	@Override
	@Transactional
	public void save(Ejecutivo ejecutivo) {
		if (ejecutivo.getIdEjecutivo() != null && ejecutivo.getIdEjecutivo() > 0)
			em.merge(ejecutivo);
		else
			em.persist(ejecutivo);
	}

	@Override
	@Transactional(readOnly = true)
	public Ejecutivo findOne(int id) {
		return em.find(Ejecutivo.class, id);
	}

	@Override
	@Transactional
	public void delete(int id) {
//		Ejecutivo ejecutivo =findOne(id);
		em.remove(findOne(id));
	}

}

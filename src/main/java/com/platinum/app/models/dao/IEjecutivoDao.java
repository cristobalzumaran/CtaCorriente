package com.platinum.app.models.dao;

import java.util.List;

import com.platinum.app.models.entity.Ejecutivo;

public interface IEjecutivoDao {

	public List<Ejecutivo> findAll();

	public void save(Ejecutivo ejecutivo);

	public Ejecutivo findOne(int id);
	
	public void delete(int id);
}

package com.platinum.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platinum.app.models.dao.IEjecutivoDao;
import com.platinum.app.models.entity.Ejecutivo;

@Service
public class EjecutivoService {
	@Autowired
	private IEjecutivoDao ejecutivoDao;

	public List<Ejecutivo> findAll() {
		return ejecutivoDao.findAll();
	}

	public void save(Ejecutivo e) {
		ejecutivoDao.save(e);
	}

	public Ejecutivo findOne(int id) {
		return ejecutivoDao.findOne(id);
	}
	
	public void delete(int id) {
		ejecutivoDao.delete(id);
	}
}

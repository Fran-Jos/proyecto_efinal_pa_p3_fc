package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.repository.IBodegaRepository;

@Service
public class IBodegaServiceImpl implements IBodegaService{

	@Autowired
	private IBodegaRepository bodegaRepository;
	
	@Override
	public void crear(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepository.insertar(bodega);
	}

}

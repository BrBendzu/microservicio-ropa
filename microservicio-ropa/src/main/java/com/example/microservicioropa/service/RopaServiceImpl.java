package com.example.microservicioropa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservicioropa.model.Ropa;
import com.example.microservicioropa.repository.RopaRepository;

@Service
public class RopaServiceImpl implements Ropaservice{

	@Autowired
	private RopaRepository repository;
	
	@Override
	public List<Ropa> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

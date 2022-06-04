package com.example.microservicioropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservicioropa.model.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer>{

}

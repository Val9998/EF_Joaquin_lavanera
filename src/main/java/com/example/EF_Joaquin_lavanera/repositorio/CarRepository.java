package com.example.EF_Joaquin_lavanera.repositorio;

import com.example.EF_Joaquin_lavanera.modelo.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}

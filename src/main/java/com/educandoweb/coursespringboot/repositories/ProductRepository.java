package com.educandoweb.coursespringboot.repositories;

import com.educandoweb.coursespringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

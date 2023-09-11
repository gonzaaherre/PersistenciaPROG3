package com.example.PersistenciaPROG.repositorios;

import com.example.PersistenciaPROG.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<Producto,Long> {
}

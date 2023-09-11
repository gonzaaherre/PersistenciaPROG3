package com.example.PersistenciaPROG.repositorios;

import com.example.PersistenciaPROG.Entidades.Cliente;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clienterepository extends JpaRepository<Cliente, Long> {
}

package com.example.PersistenciaPROG.repositorios;

import com.example.PersistenciaPROG.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}

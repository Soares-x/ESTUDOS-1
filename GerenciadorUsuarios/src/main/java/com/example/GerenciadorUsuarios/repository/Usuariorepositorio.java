package com.example.GerenciadorUsuarios.repository;

import com.example.GerenciadorUsuarios.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuariorepositorio extends JpaRepository<Usuario, Long> {
}

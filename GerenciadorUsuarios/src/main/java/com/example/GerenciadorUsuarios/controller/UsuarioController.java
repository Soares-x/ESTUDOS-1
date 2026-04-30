package com.example.GerenciadorUsuarios.controller;

import com.example.GerenciadorUsuarios.entity.Usuario;
import com.example.GerenciadorUsuarios.repository.Usuariorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private Usuariorepositorio repository;

    @GetMapping
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteAllById(Collections.singleton(id));
    }
}

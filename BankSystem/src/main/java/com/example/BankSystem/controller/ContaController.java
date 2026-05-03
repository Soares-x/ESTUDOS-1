package com.example.BankSystem.controller;

import com.example.BankSystem.model.Conta;
import com.example.BankSystem.service.ContaService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    private final ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    @PostMapping
    public Conta criar(@RequestBody Conta conta) {
        return service.criarConta(conta);
    }

    @GetMapping
    public List<Conta> listar() {
        return service.listar();
    }

    @PostMapping("/{id}/deposito")
    public Conta depositar(@PathVariable Long id, @RequestParam Double valor) {
        return service.depositar(id, valor);
    }

    @PostMapping("/{id}/saque")
    public Conta sacar(@PathVariable long id, @RequestParam Double valor) {
        return service.sacar(id, valor);
    }
}
















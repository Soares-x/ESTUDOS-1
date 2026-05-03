package com.example.BankSystem.service;

import com.example.BankSystem.model.Conta;
import com.example.BankSystem.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public Conta criarConta(Conta conta) {
        conta.setSaldo(0.0);
        return repository.save(conta);
    }

    public List<Conta> listar() {
        return repository.findAll();
    }

    public Conta depositar(Long id, Double valor) {
        Conta conta = repository.findById(id).orElseThrow();
        conta.setSaldo(conta.getSaldo() + valor);
        return repository.save(conta);
    }

    public Conta sacar(Long id, Double valor) {
        Conta conta = repository.findById(id).orElseThrow();

        if (conta.getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }
        conta.setSaldo(conta.getSaldo() - valor);
        return repository.save(conta);
    }
}
















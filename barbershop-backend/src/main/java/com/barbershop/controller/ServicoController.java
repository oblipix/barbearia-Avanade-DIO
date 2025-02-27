package com.barbershop.controller;

import com.barbershop.model.Servico;
import com.barbershop.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicos")
@CrossOrigin("*")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping
    public List<Servico> listarServicos() {
        return servicoService.listarServicos();
    }

    @GetMapping("/{id}")
    public Optional<Servico> buscarServicoPorId(@PathVariable Long id) {
        return servicoService.buscarServicoPorId(id);
    }

    @PostMapping
    public Servico salvarServico(@RequestBody Servico servico) {
        return servicoService.salvarServico(servico);
    }

    @DeleteMapping("/{id}")
    public void deletarServico(@PathVariable Long id) {
        servicoService.deletarServico(id);
    }
}

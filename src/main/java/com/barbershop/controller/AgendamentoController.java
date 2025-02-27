package com.barbershop.controller;

import com.barbershop.model.Agendamento;
import com.barbershop.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agendamentos")
@CrossOrigin("*")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return agendamentoService.listarAgendamentos();
    }

    @GetMapping("/{id}")
    public Optional<Agendamento> buscarAgendamentoPorId(@PathVariable Long id) {
        return agendamentoService.buscarAgendamentoPorId(id);
    }

    @PostMapping
    public Agendamento salvarAgendamento(@RequestBody Agendamento agendamento) {
        return agendamentoService.salvarAgendamento(agendamento);
    }

    @DeleteMapping("/{id}")
    public void deletarAgendamento(@PathVariable Long id) {
        agendamentoService.deletarAgendamento(id);
    }
}

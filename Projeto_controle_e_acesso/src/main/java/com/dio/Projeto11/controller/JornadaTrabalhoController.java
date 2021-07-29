package com.dio.Projeto11.controller;

import com.dio.Projeto11.Service.JornadaService;
import com.dio.Projeto11.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping ("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping(value = "sdf")
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornada() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throw Exception {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() ->new NoSuchElementException("Not found")));

    }
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }
    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteByID(@PathVariable("idJornada") Long idJornada) throw Exception {
        try {
            jornadaService.deleteJornadaTrabalho(idJornada);
        } catch (Exeptional o){
            System.out.println(e.getMessage());
        }
        return ResponseEntity<JornadaTrabalho> ResponseEntity.ok();

    }
}


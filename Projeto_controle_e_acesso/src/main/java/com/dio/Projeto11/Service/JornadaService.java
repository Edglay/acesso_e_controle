package com.dio.Projeto11.Service;

import com.dio.Projeto11.Repository.JornadaRepository;
import com.dio.Projeto11.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }
    @GetMapping
    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();

}

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById();
    }
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }
    public void deleteJornadaTrabalho (Long idJornada) {
        jornadaRepository.deleteById(idJornadda);
    }

}

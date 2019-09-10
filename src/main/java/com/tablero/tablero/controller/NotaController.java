package com.tablero.tablero.controller;

import java.util.List;

import com.tablero.tablero.model.Nota;
import com.tablero.tablero.repo.RepositorioNota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas")
@CrossOrigin("http://localhost:4200")
public class NotaController {
    @Autowired
    RepositorioNota repositorioNota;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Nota nota) {
        repositorioNota.save(nota);
    }

    @RequestMapping(value = "/{idNota}")
    public Nota read(@PathVariable String idNota) {
        return repositorioNota.findByIdNota(idNota);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Nota> readNotas() {
        return repositorioNota.findAll();
    }

    @RequestMapping(value = "/{idNota}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String idNota) {
        repositorioNota.deleteById(idNota);
    }

}

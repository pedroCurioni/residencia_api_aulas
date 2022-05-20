package com.residencia.academia.controller;



import com.residencia.academia.entity.Turma;
import com.residencia.academia.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    @Autowired
    TurmaService turmaService;

    @GetMapping
    public ResponseEntity<List<Turma>> findAll() {
        return new ResponseEntity<>(turmaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(turmaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Turma> save(@RequestBody Turma turma) {
        return new ResponseEntity<>(turmaService.save(turma), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Turma> update(@RequestBody Turma turma) {
        return new ResponseEntity<>(turmaService.save(turma), HttpStatus.OK);
    }

    @DeleteMapping
    public void delete (Integer id) {
        turmaService.delete(id);
    }
}

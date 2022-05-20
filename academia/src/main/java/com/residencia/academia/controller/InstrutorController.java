package com.residencia.academia.controller;

import com.residencia.academia.entity.Instrutor;
import com.residencia.academia.service.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    @Autowired
    InstrutorService instrutorService;

    @GetMapping
    public ResponseEntity<List<Instrutor>> findAll() {
        List<Instrutor> instrutorList = instrutorService.findAll();
        return new ResponseEntity<>(instrutorList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instrutor> findInstrutorById(@PathVariable Integer id) {
        //return new ResponseEntity<>(instrutorService.findInstrutorById(id), HttpStatus.OK);
        Instrutor instrutor = instrutorService.findById(id);
        return new ResponseEntity<>(instrutor, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Instrutor> save(@RequestBody Instrutor instrutor) {
        return new ResponseEntity<>(instrutor, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Instrutor> update(@RequestBody Instrutor instrutor) {
        return new ResponseEntity<>(instrutor, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity delete (Integer id) {
        return new ResponseEntity(instrutorService.findById(id), HttpStatus.OK);
    }
}

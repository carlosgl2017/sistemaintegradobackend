package com.sistemas.integradobackend.informix.controllers;

import com.sistemas.integradobackend.informix.entities.Tcndtr;
import com.sistemas.integradobackend.informix.services.TcndtrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cndtr")
public class TcndtrController {
    @Autowired
    private TcndtrService tcndtrService;

    @GetMapping("/sel/{fechaini}/{fechafin}")
    public List<Tcndtr> listar(@PathVariable String fechaini,@PathVariable String fechafin){
        return tcndtrService.listar(fechaini,fechafin);
    }
}

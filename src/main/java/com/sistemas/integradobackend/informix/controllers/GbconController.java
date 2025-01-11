package com.sistemas.integradobackend.informix.controllers;

import com.sistemas.integradobackend.informix.entities.Gbcon;
import com.sistemas.integradobackend.informix.services.GbconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gbcon")
public class GbconController {
    @Autowired
    private GbconService gbconService;

    @GetMapping("/sel")
    public List<Gbcon> listar(){
        return gbconService.listar();
    }
}

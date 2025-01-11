package com.sistemas.integradobackend.informix.services;

import com.sistemas.integradobackend.informix.entities.Gbcon;
import com.sistemas.integradobackend.informix.repositories.GbconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GbconServiceImpl implements GbconService{
    @Autowired
    private GbconRepository gbconRepository;
    @Override
    public List<Gbcon> listar() {
        return gbconRepository.listar();
    }
}

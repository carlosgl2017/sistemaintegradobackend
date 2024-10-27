package com.sistemas.integradobackend.informix.services;

import com.sistemas.integradobackend.informix.entities.Tcndtr;
import com.sistemas.integradobackend.informix.repositories.TcndtrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TcndtrServiceImpl implements TcndtrService {
    @Autowired
    private TcndtrRepository tcndtrRepository;

    @Override
    public List<Tcndtr> listar(String fechaini, String fechafin) {
        return tcndtrRepository.listar(fechaini,fechafin);
    }
}

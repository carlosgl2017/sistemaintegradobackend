package com.sistemas.integradobackend.informix.services;

import com.sistemas.integradobackend.informix.entities.Tcndtr;

import java.util.List;

public interface TcndtrService {
    public List<Tcndtr> listar(String fechaini, String fechafin);
}

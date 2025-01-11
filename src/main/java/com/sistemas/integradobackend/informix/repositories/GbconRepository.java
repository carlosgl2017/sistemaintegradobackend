package com.sistemas.integradobackend.informix.repositories;

import com.sistemas.integradobackend.informix.entities.Gbcon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GbconRepository extends CrudRepository<Gbcon,String> {

    @Query(value = "select \n" +
            "gbconpfij,\n" +
            "gbconcorr,\n" +
            "trim (gbcondesc) as gbcondesc ,\n" +
            "gbconabre,\n" +
            "gbconmmod,\n" +
            "gbconmrcb\n" +
            "from gbcon", nativeQuery = true)
    public List<Gbcon> listar();
}

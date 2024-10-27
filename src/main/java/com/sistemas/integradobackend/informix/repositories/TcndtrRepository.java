package com.sistemas.integradobackend.informix.repositories;

import com.sistemas.integradobackend.informix.entities.Tcndtr;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TcndtrRepository extends CrudRepository<Tcndtr,String> {
    @Query(value = "select \n" +
            "a.rowid as rowid,\n" +
            "a.cndtrntra as cndtrntra,\n" +
            "a.cndtrtdoc as cndtrtdoc,\n" +
            "a.cndtrndoc as cndtrndoc,\n" +
            "a.cndtrfdoc as cndtrfdoc,\n" +
            "a.cndtrmorg as cndtrmorg,\n" +
            "a.cndtritem as cndtritem,\n" +
            "trim(a.cndtrcnta) as cndtrcnta,\n" +
            "trim(a.cndtrglos) as cndtrglos,\n" +
            "a.cndtrimpi as cndtrimpi,\n" +
            "a.cndtrcmon as cndtrcmon,\n" +
            "a.cndtrcamb as cndtrcamb,\n" +
            "a.cndtrimpc as cndtrimpc,\n" +
            "a.cndtrtcon as cndtrtcon,\n" +
            "a.cndtrncon as cndtrncon,\n" +
            "a.cndtrmrcb as cndtrmrcb,\n" +
            "a.cndtrmrev as cndtrmrev,\n" +
            "a.cndtrplaz as cndtrplaz,\n" +
            "a.cndtragen as cndtragen,\n" +
            "a.cndtrccos as cndtrccos,\n" +
            "a.cndtrnrle as cndtrnrle,\n" +
            "a.cndtrcbnq as  cndtrcbnq,\n" +
            "b.cnplcnomb as  cnplcnomb from cndtr as a join cnplc as b\n" +
            "on a.cndtrcnta=b.cnplccnta where a.cndtrfdoc between  :fechaini and :fechafin and cndtrmrcb=0;", nativeQuery = true)
    public List<Tcndtr> listar(String fechaini,String fechafin);
}

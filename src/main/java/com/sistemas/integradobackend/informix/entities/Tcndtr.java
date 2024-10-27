package com.sistemas.integradobackend.informix.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name="cndtr")
public class Tcndtr implements Serializable {

    private static final long serialVersionUID = -1682257793736513550L;
    @Id
    private String rowid;
    private String cndtrntra;
    private String cndtrtdoc;
    private String cndtrndoc;
    private String cndtrfdoc;
    private String cndtrmorg;
    private String cndtritem;
    private String cndtrcnta;
    private String cndtrglos;
    private String cndtrimpi;
    private String cndtrcmon;
    private String cndtrcamb;
    private String cndtrimpc;
    private String cndtrtcon;
    private String cndtrncon;
    private String cndtrmrcb;
    private String cndtrmrev;
    private String cndtrplaz;
    private String cndtragen;
    private String cndtrccos;
    private String cndtrnrle;
    private String cndtrcbnq;
    private String cnplcnomb;
}

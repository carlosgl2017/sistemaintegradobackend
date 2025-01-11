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
@Table(name="gbcon")
public class Gbcon implements Serializable {
    private static final long serialVersionUID = 6553452921465515301L;
    @Id
    private String gbconpfij;
    private String gbconcorr;
    private String gbcondesc;
    private String gbconabre;
    private String gbconmmod;
    private String gbconmrcb;

}

package com.sistemas.integradobackend.auth.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleGrantedAuthorityJsonCreator {
    public SimpleGrantedAuthorityJsonCreator(@JsonProperty("authority") String role) {

    }
}

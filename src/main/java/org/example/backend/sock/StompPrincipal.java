package org.example.backend.sock;

import org.springframework.stereotype.Component;

import java.security.Principal;


public class StompPrincipal implements Principal {
    String name;

    StompPrincipal(String name) { this.name = name; }



    @Override
    public String getName() { return name;}
}
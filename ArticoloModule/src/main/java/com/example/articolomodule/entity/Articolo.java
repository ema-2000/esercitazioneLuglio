package com.example.articolomodule.entity;

import lombok.Data;
import lombok.extern.java.Log;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Articolo")
@Data
@Log
public class Articolo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false)
    private Long articolo;

    @Column
    private String titoloArticolo;

    public void setArticolo(Long articolo) {
        this.articolo = articolo;
    }

    public Long getArticolo() {
        return articolo;
    }
}

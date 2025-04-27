package com.utscaseG.homework_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "homework")

public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
 
    private String judulTugas;
    private String deskripsi;
 
 
    // Constructor tanpa parameter
    public Homework() {}
 
 
    // Constructor dengan parameter
    public Homework(String judulTugas, String deskripsi) {
        this.judulTugas = judulTugas;
        this.deskripsi = deskripsi;
    }
 
 
    // Getters dan Setters
    public Long getId() {
        return id;
    }
 
 
    public void setId(Long id) {
        this.id = id;
    }
 
 
    public String getJudulTugas() {
        return judulTugas;
    }
 
 
    public void setJudulTugas(String judulTugas) {
        this.judulTugas = judulTugas;
    }
 
    public String getDeskripsi() {
     return deskripsi;
     }
 
 
     public void setDeskripsi(String deskripsi) {
         this.deskripsi = deskripsi;
     }

}

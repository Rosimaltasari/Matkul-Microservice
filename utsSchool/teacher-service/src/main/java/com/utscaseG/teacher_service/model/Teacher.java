package com.utscaseG.teacher_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "teacher")

public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
 
    private String nama;
    private String subject;
    private String nip;
 
 
    // Constructor tanpa parameter
    public Teacher() {}
 
 
    // Constructor dengan parameter
    public Teacher(String nama, String subject, String nip) {
        this.nama = nama;
        this.subject = subject;
        this.subject = nip;
    }
 
 
    // Getters dan Setters
    public Long getId() {
        return id;
    }
 
 
    public void setId(Long id) {
        this.id = id;
    }
 
 
    public String getNama() {
        return nama;
    }
 
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getSubject() {
     return subject;
     }
 
 
     public void setSubject(String subject) {
         this.subject = subject;
     }
    public String getNip() {
     return nip;
     }
 
 
     public void setNip(String nip) {
         this.nip = nip;
     }

}

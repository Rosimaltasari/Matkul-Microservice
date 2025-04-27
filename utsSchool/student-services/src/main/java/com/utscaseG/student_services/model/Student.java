package com.utscaseG.student_services.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")

public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;


   private String nama;
   private String nama_kelas;


   // Constructor tanpa parameter
   public Student() {}


   // Constructor dengan parameter
   public Student(String nama, String nama_kelas) {
       this.nama = nama;
       this.nama_kelas = nama_kelas;
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

   public String getNama_kelas() {
    return nama_kelas;
    }


    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }
}

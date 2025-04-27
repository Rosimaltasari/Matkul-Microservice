package com.utscaseG.student_services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utscaseG.student_services.model.Student;
import com.utscaseG.student_services.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


   @Autowired
   private StudentRepository studentRepository;


   public List<Student> getAllStudent() {
       return studentRepository.findAll();
   }


   public Optional<Student> getStudentById(Long id) {
       return studentRepository.findById(id);
   }


   public Student createStudent(Student student) {
       return studentRepository.save(student);
   }


   public Student updateStudent(Long id, Student studentDetails) {
       Student student = studentRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("student tidak ditemukan dengan id " + id));
       student.setNama(studentDetails.getNama());
       student.setNama_kelas(studentDetails.getNama_kelas());
       return studentRepository.save(student);
   }


   public void deleteStudent(Long id) {
       Student student = studentRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("student tidak ditemukan dengan id " + id));
       studentRepository.delete(student);
   }
}

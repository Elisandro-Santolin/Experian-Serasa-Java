package com.t3.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t3.springrest.entity.Student;
import com.t3.springrest.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student findStudentById(Long id) {
        Optional<Student> optStudent = studentRepository.findById(id);
        if (optStudent.isPresent()) {
            return optStudent.get();
        } else {
            return new Student(0, "Ninguém", "Não existe", "00000000000");
        }
    }

    public List<Student> findAllStudents(){
        List<Student> allStudents = studentRepository.findAll();
        return allStudents;
    }

    public Student createStudent(Student student) {
        student = studentRepository.save(student);
        return student;
    }

    public void deleteStudentById(Long id){
        if(studentRepository.existsById(id)){
           studentRepository.deleteById(id);
        }
    }

    public Student updateStudent(Student newStudent, Long id){
        Optional<Student> optStudent = studentRepository.findById(id);
        if(optStudent.isPresent()){
            //Pega o estudante do bando de dados
            Student oldStudent = optStudent.get();

            //Altera somente o nome e o email do estudante
            oldStudent.setFullName(newStudent.getFullName());
            oldStudent.setEmail(newStudent.getEmail());

            newStudent = studentRepository.save(oldStudent); // se nao tiver ele criar, se tiver ele atualiza
            return newStudent;
        }else {
            return null;
        }
    }
}


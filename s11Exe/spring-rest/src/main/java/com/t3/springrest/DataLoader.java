package com.t3.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.t3.springrest.entity.Student;
import com.t3.springrest.service.StudentService;

@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired 
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        studentService.createStudent(new Student("Ricardo Silveira", "r.silveira@email.com", "78932648521"));
        studentService.createStudent(new Student("Matheus Loures", "r.silveira@email.com", "78932648521"));
        studentService.createStudent(new Student("Bino Loures", "r.soarez@email.com", "585966698411"));
    }
    
}

package com.t3.springpostgre;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller // ## indica que a classe é um controller ## //
public class StudentController {

    // ## inicializamos o JPA com o nosso banco de dados ## //
        private StudentRepository repository;


    // ## inicializamos o nosso repositorio no construtor da classe ## //
        public StudentController(StudentRepository repository){ // ## isso é um construtor ## //
            this.repository = repository;
        }

        @GetMapping(value = "/") // ## AQUI MAPEAMOS a URL "/" para o templante index.html ## //
        public String index(){
            return "index";
        }
    
        @GetMapping("/students/add") // ## AQUI MAPEAMOS a URL "/" para o templante addEdit.html ## //
        public String createStudent(Model model){
            model.addAttribute("student", new Student());
            return "addEdit";
        }

        @PostMapping("/students/save") // ## mapeamos a URL com metodo POST "/students/save" para salvar o Objeto no banco, e redirecionamos para a URL students ## //
        public String saveStudent(Student student){
            repository.save(student);
            return "redirect:/students";
        }

        @GetMapping("/students")
        public String getAllStudents(Model model){
            model.addAttribute("students", repository.findAll());
            return "/studentList";
        }

        @GetMapping("/students/edit/{ra}")
        public String editStudent(Model model, @PathVariable(value = "ra")long ra){
            // ## findById procura um objeto pela sua chave primaria ## // 
            model.addAttribute("student", repository.findAllById(null));

            return "addEdit";
        }
}

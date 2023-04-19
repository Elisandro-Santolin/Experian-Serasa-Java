package com.t3.springpostgre;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
            model.addAttribute("subtitle", "Adding a new Student");
            model.addAttribute("student", new Student());
            return "addEdit";
        }

        @PostMapping("/students/save") // ## mapeamos a URL com metodo POST "/students/save" para salvar o Objeto no banco, e redirecionamos para a URL students ## //
        public String saveStudent(Student student){
            repository.save(student);
            return "redirect:/students";
        }

        @GetMapping("/students")
        public String getAllStudents(Model model, @RequestParam(value = "sort", defaultValue = "ra") String sort){
            model.addAttribute("students", repository.findAll(Sort.by(sort)));
            return "/studentList";
        }

        @GetMapping("/students/edit/{ra}")
        public String editStudent(Model model, @PathVariable(value = "ra")long ra){
            // ## findById procura um objeto pela sua chave primaria ## // 
            model.addAttribute("subtitle", "Edit a Student");
            model.addAttribute("students", repository.findById(ra));
            return "addEdit";
        }

        // ## mapeamos a URL "/students/delete/{ra}" onde se captura o valor de {ra} atraves da anotação @PathVariable ## //
        @GetMapping("/students/delete/{ra}")
        public String deleteStudent(@PathVariable(value = "ra") long ra){ 
            repository.deleteById(ra);
            return "redirect:/students";
        }

        // ## passa um valor para todos os models que tenha o atributo descrito ## // 
        @ModelAttribute("periodOption")
        public List<Period> selectOptionsPeriod(){ // ## isso aqui é um método ## //
            return Arrays.asList(Period.values());

        }   
}

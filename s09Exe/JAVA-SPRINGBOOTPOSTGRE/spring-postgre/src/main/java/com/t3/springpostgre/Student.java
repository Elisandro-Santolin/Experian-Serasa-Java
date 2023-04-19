package com.t3.springpostgre;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //## entidade - é uma classe que representa uma tabela, as instâncias são as linhas dessa tabela ## // // ## classe = table << >> objeto = linha## //
public class Student {
    
    @Id // ## indica a propriedade que sera a CHAVE PRIMARIA da tabela## //
    @GeneratedValue(strategy = GenerationType.AUTO) // ## Diz para gerar um valor dessa propriedade ## //
    private long ra;

    private String firstName;
    private String lastName;
    private String course;
    private Period period; // ## isso é um ENUM ## //

    public Student() { // ## necessário para o JPA trabalhar com o banco ## //
    }

    public Student(String firstName, String lastName, String course, Period period) { // ## não gera o RA pois ele é gerado automáticamente ## //
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.period = period;
    }

    @Override
    public String toString() {
        return "Student [ra=" + ra + ", firstName=" + firstName + ", lastName=" + lastName + ", course=" + course + ", period=" + period +"]";
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
        
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

}

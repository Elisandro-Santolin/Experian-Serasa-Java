import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App02 {
    public static void main(String[] args) throws Exception {
        Person pessoa1 = new Person("João", "Silva", "32145698725", 35);
        Person pessoa2 = new Person("Maria", "Silva", "32145158725", 35);
        Person pessoa3 = new Person("Ricardo", "Faria", "8539698725", 55);

        Map<String, Person>mapaDeusuarios = new HashMap<>();
        mapaDeusuarios.put("Gerente", pessoa1);
        mapaDeusuarios.put("Diretor", pessoa2);
        mapaDeusuarios.put("Publicidade", pessoa3);
        
        System.out.println(mapaDeusuarios.get("Diretor"));
        System.out.println(mapaDeusuarios.get("Gerente"));
        System.out.println(mapaDeusuarios.get("Publicidade"));
    }
}

class Person{
    private String name;
    private String lastName;
    private String cpf;
    private int age;

    public Person(String name, String lastLame, String cpf, int age) {
        this.name = name;
        this.lastName = lastLame;
        this.cpf = cpf;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastLame=" + lastName + ", cpf=" + cpf + ", age=" + age + "]";
    }

    public String completeName(){
        return (this.name + " "+ this.lastName);
    }
}
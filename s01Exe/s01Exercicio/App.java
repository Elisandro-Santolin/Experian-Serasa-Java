package s01Exercicio;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro brisa = new Cachorro("Brisa", "salsicha", 23, 2021, 6f, true, 'F');
        brisa.description();
        //imc.description();
    }
}
class Cachorro { // ## define o objeto - objeto cachoro ## //

    private String race;
    private float size;
    private int age;
    private String name;
    private char sex;
    private float weight;
    private boolean hasVaccine;
    
    public Cachorro(String name, String race, float size, int birth, float weight, boolean hasVaccine, char sex){ // ## construtor ## //
        //this.name = name;
        this.race = race;
        this.size = size;
        this.age = 2023 - birth;
        this.weight = weight;
        //this.hasVaccine = hasVaccine;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Brisa";
    }

    public boolean gethasVaccine() {
        return hasVaccine;
    }

    public void sethasVaccine(boolean hasVaccine) {
        this.hasVaccine = true;
    }
    
    public void description(){ // ## esse é o método ## //
            System.out.println("Esse é o nome do cachorro "+name+
            " sua raça é "+race+" e tem o tamanho "+size+
            " a idade do cachorro é "+age+" hoje tem o peso de "+weight+"."+
            " Ele está vacinado? "+hasVaccine+" é do sexo "+sex+".");
    }

    public void imcc(){

        float imcc = (weight / (size * size));
        
        if(imcc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if (imcc > 18.5 && imcc <= 25){
            System.out.println("Peso normal");
        }else if (imcc > 25 && imcc <= 30){
            System.out.println("Acima do peso");
        }else {
            System.out.println("Obeso");
        }
    }
}






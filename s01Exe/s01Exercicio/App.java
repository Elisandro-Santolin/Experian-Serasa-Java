package s01Exercicio;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro brisa = new Cachorro("Brisa", "salsicha", 35f, 1 , 12f, true, 'F', "chocolate");
        System.out.println("\n######################## Execução inicio ###########################\n");
        System.out.println(brisa.description());
        System.out.println(Cachorro.bark()); // ## chamou a static bark ## //
        System.out.println("\n######################## Execução encerrada ########################\n");
    }
}
class Cachorro { // ## define o objeto - objeto cachoro ## //

    private String  name;
    private String  race;
    private float   size;
    private int     age;
    private float   weight;
    private boolean hasVaccine;
    private char    sex;
    private String  color;
    
    public Cachorro(String name, String race, float size, int age, float weight, boolean hasVaccine, char sex, String color){ // ## construtor ## // // # instanciamento -> criacao de um objeto ## //
        this.name       = name;
        this.race       = race;
        this.size       = size;
        this.age        = age;
        this.weight     = weight;
        this.hasVaccine = hasVaccine;
        this.sex        = sex;
        this.color      = color;
    }
    
    public String description(){ // ## esse é o método ## //
        String vacinado;

        if(this.hasVaccine){
            vacinado = "E está com a vacina em dia";
        }else {
            vacinado = "E não está com a vacina em dia";
        }

        if(this.sex == 'F'){
            return ("Essa é a "+this.name+
            " sua raça é "+this.race+" e tem o tamanho "+this.size+
            " a idade dela é "+this.age+" anos, hoje tem o peso de "+this.weight+" KG. "
            +vacinado+" é do sexo "+this.sex+" e sua cor é "+this.color+".");
        }else{
            return ("Esse é o nome do cachorro "+this.name+
                " sua raça é "+this.race+" e tem o tamanho "+this.size+
                " a idade do cachorro é "+this.age+" anos, hoje tem o peso de "+this.weight+" KG. "
                +vacinado+" é do sexo "+this.sex+" e sua cor é "+this.color+".");
            }
    }

    public String imcc(){
        float imcc = (this.weight / (this.size * this.size)); // ## uso do this. é uma boa prática ## //
        
        if(imcc <= 18.5f){
            return "Abaixo do peso";
        }else if (imcc > 18.5f && imcc <= 25f){
            return "Peso normal";
        }else if (imcc > 25f && imcc <= 30f){
            return "Acima do peso";
        }else {
            return "Obeso";
        }
    }

    public String getName(){
        return this.name; 
    }
    
    public void setName(String name){
        this.name = name;
    }

    public boolean getHasVaccine(){
        return this.hasVaccine; 
    }
    
    public void setHasVaccine(boolean hasVaccine){
        this.hasVaccine = hasVaccine;
    }

    public static String bark(){ // ## metodo static dá para utilizar como uma função, sem instaciar ## //

        int option = (int)(Math.random() * 7);

        switch (option){
            case 0:
                return "woof-woof";
            case 1:
                return "au-au";
            case 2:
                return "bau-bau";
            case 3:
                return "orgh-orgh";
            case 4:
                return "ruff-ruff";
            case 5:
                return "uhg-uhg";
            case 6:
                return "yap-yap";
            default:
                return "erro";
        } 
    }
}






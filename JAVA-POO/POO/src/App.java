public class App {
    public static void main(String[] args) throws Exception {
            Cachorro brisa = new Cachorro("Brisa", 2022);
            Cachorro luke = new Cachorro("Luke", 2017); // ## nova instância da classe - instância luke ## //
            luke.color = "cinza";
            //System.out.println(brisa.name);
            brisa.description(); // ## chama o método ## //
            luke.description(); // ## chamando de novo o método com outra variavel(luke)## //
    }
}
class Cachorro { // ## define o objeto - objeto cachoro ## //

    String race;
    float size;
    String color;
    int age;
    String name;

    public Cachorro(String name, int birth){ // ## esse é o construtor ## //
        this.name = name;  // ## this. referencia uma propriedade da classe ## //
        this.size = 40f;
        this.race = "Dachshund";
        this.color = "chocolate";
        this.age = 2023 - birth;
    }
    
    public void description(){ // ## esse é o método ## //
        System.out.println("Essa é a "+this.name+", ela é um cachorro da raça "+this.race+" e tem a cor "+this.color+"!");

        

    }
}

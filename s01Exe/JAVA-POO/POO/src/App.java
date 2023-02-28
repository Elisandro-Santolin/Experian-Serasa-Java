public class App {
    public static void main(String[] args) throws Exception {
        Cachorro rex = new Cachorro("Rex", "alienigina", "verde", 55f, 1890);
        Cachorro ciclop = new Cachorro("Ciclop");
        Cachorro spyke = new Cachorro("Spyke");
        Cachorro wolverine = new Cachorro("Wolverine", "poodle-alienigina", "vermelha", 65f, 1650);
        rex.description();
        ciclop.description();
        spyke.description();
        wolverine.description();
        System.out.println("Execução Terminada!!");
            //Cachorro brisa = new Cachorro("Brisa", 2022);
            //Cachorro luke = new Cachorro("Luke", 2017); // ## nova instância da classe - instância luke ## //
                //luke.color = "cinza";
            //brisa.description(); // ## chama o método ## //
            //luke.description(); // ## chamando de novo o método com outra variavel(luke)## //
            /* 
                #########################################################################################
                Glass copo = new Glass(300f);
                    copo.setLiquidVolume(250f);
                System.out.println("Volume do copo: "+copo.getLiquidoVolume());
                System.out.println("Volume do liquido: "+copo.getVolume());
                System.out.println(copo.description());
                #########################################################################################
            */
    }
}
class Cachorro { // ## define o objeto - objeto cachoro ## //

    private String race;
    private float size;
    private String color;
    private int age;
    private String name;
    // private char sex;
    // private float weight;
    // private float thirstMeter;
    // private boolean hasVaccine;


    /* 
    #########################################################################################
    public Cachorro(String name, int birth){ // ## esse é o construtor ## //
    this.name = name;  // ## this. referencia uma propriedade da classe ## //
    this.size = 40f;
    this.race = "Dachshund";
    this.color = "chocolate";
    this.age = 2023 - birth;
    ########################################################################################
    }
    */
    public Cachorro(String name){
        this.name = name;
        this.race = "Vira-lata";
        this.color = "Caramelo";
        this.size = 40f;
        this.age = 2;
    }
    
    public Cachorro(String name, String race, String color, float size, int birth){ // ## construtor ## //
        this.name  = name;
        this.race  = race;
        this.color = color;
        this.size  = size;
        this.age   = 2023 - birth;
    }
    
    public void description(){ // ## esse é o método ## //
        System.out.println("Esse é o "+this.name+", ele é um cachorro da raça "+this.race+" de porte "+size+" de cor "+this.color+" e tem "+this.age+" anos!");
    }
}
class Glass {
    private float volume;      // ## em casos de private usar getters e setters ## //
    private float liquidVolume;

    public Glass (float volume){
        this.volume = volume;
        this.liquidVolume = 0f;
    }
    public float getLiquidoVolume(){
        return liquidVolume;
    }
    public void setLiquidVolume(float liquidVolume){
        if(liquidVolume < 0){
            return;
        }if (liquidVolume > this.volume){
            this.liquidVolume = this.volume;
            return;
        }
        this.liquidVolume = liquidVolume;
        }
        public float getVolume(){
            return this.volume;
        }
        public String description(){
            return("O volume do copo é de "+this.volume+" e o volume de liquido é "+this.liquidVolume);
        }
}


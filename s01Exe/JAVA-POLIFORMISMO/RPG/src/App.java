public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n################### RPG Start ####################\n");
        // Character hector = new Character("Hector", 5, 10, 3); // ## >> class abstrata não instancia << ## // ## >> class base << ## // ## >> valida somente as subclasses da classe abstrata << ## //
        // System.out.println(hector.getName());
        // hector.attack();

        Mage ryze = new Mage("Ryze", 8, 8, 35, 100);
        System.out.println(ryze.getName());
        //System.out.println(luiz.getMana());
        System.out.println("Vida Máxima: "+ryze.getHealth());

        Warrior darius = new Warrior("Darius", 25, 4, 45);
        System.out.println(darius.getName());
        System.out.println("Vida Máxima: "+darius.getHealth());

        darius.attack(ryze);
        System.out.println("Vida restante: "+ryze.actualHealth);
        darius.attack(ryze);
        darius.Hello(ryze); 

        System.out.println("\n################### RPG End ####################\n");
    }
}

abstract class Character{ // ## classe pai ## //
    protected String name;
    protected int strength;
    protected int intelligence;
    protected int constitution;


    private int health;
    public int actualHealth;

    public Character(String name, int strength, int intelligence, int constitution, int health){ // ## construtor - executado na instância ## //
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.health = health;
        this.actualHealth = health;
    }
    public void Hello(Character target){ // ## >> novo método << ## //
        System.out.println(this.getName()+" diz oi para "+target.getName()+"!"); // ## >> this. referencia quem chamou << ##//
    }
    public int getHealth(){
        return health;
    }
    public final String getName(){ // ## metodo getName - String se refere ao retorno esperado  = palavra ou frase ## // >> usando final não permite subescrever ou modificar fazer um overide não permite << //
        return this.name;
    }
    public void attack(Character target){
        //System.out.println("Total de dano fisico: "+strength);
    }
    public abstract void job();
}

class Mage extends Character{   // ## isso aqui é uma herança ## //
    protected int mana;

    public Mage(String name, int strength, int intelligence, int constitution, int mana){
        super(name, strength, intelligence, constitution, constitution * 4);
        this.mana = mana;
    }
    public int getMana(){
        return this.mana;
    }
    @Override
    public void attack(Character target){ 
        int dano = (intelligence * 2);
        System.out.println("Total de dano mágico: "+dano);
        target.actualHealth -= dano;

        if(target.actualHealth > 0){
            System.out.println(target.getName()+" Sobreviveu");
        }else {
            System.out.println(target.getName()+" Morreu");
        }
    }
    @Override
    public void job(){ // ## >> metodo abstrato, so podem existir em subclasses abstratas << ## // 
        System.err.println("MAGE");
    }
}

    class Warrior extends Character{
        public Warrior(String name, int strength, int intelligence, int constitution){
            super(name, strength, intelligence, constitution, constitution * 5);
        }
        @Override 
        public void attack(Character target){
            int dano = (this.strength * 3);
            System.out.println("Total dano fisico: "+dano);
            target.actualHealth -= dano;
    
            if(target.actualHealth > 0){
                System.out.println(target.getName()+" Sobreviveu");
            }else {
                System.out.println(target.getName()+" Morreu");
            }
        }
        @Override
        public void job(){
            System.out.println("WARRIOR");
        }
    }  

public class Bar { // CLASSE PAI //
    
    Bar(){
        System.out.println("Objeto Bar foi inicializado");
    }

    class Foobar extends Bar { // HERANCA - FILHO DO BAR 
        Foobar(){
            System.out.println("Objeto Foobar foi inicializado ");
        }
    }

    class FoobarJunior extends Foobar { // HERANCA - FILHO DO FOOBAR 
        FoobarJunior(){
            System.out.println("Objeto FoobarJunior foi inicializado");
        }
    }
}

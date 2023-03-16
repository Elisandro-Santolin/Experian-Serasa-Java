
public class App {
    public static void main(String[] args) throws Exception {
        
    /*     
     * 
     * Foo object1 = new Foo(1, 5);  // INSTANCIA E CRIA UM NOVO OBJETO PRECISA DE CONSTRUTOR O OBJETO//
     * Foo object2 = new Foo(8, 2); // OBJETO //
     * System.out.println(Foo.sumStatic(45, 46)); // MÉTODO ESTATICO NAO PRECISA INSTANCIAR O OBEJTO //
     */
        
       // Bar objBar = new Bar(); // AQUI VAI OS ARGUMENTOS//

    }
}

class Foo{ 
    private int number1;  // PROPRIEDADE //
    private int number2;
    private static int numberStatic = 0; // PERTENCE A PRÓPRIA CLASSE //
    //private final static int NUMBERSTATIC = 10;  // SE ESTIVER COM FINAL O VALOR NÃO PODE SER ALTERADO CONSTANTE //

    public Foo(int number1, int number2) { // CONSTRUTOR //
        this.number1 = number1;
        this.number2 = number2;
        numberStatic++;
    }

    public int getNumber1() { // MÉTODOS //
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public static int getNumberStatic() {  // MÉTODOS ESTATICO // 
        return numberStatic;
    }

    public static void setNumberStatic(int numberStatic) {
        Foo.numberStatic = numberStatic;
    }

    public static int sumStatic(int num1, int num2){ // MÉTODO //
        return num1 + num2;
    }

    public static int sum(int num1, int num2){ // MÉTODO //
        return num1 + num2;
    }
}
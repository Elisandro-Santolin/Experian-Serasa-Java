// import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Glass glass = new Glass(473);
        GlassThermic glassThermic = new GlassThermic (435, 45);

        try {
            glass.fill(456);
            glassThermic.fill(456);
        }catch (Exception e){
            System.out.println(e.getMessage()); // ## gera a mensagem diretamente ao tratar algum erro ## //
        }
        
        System.out.println(" ################### Execução terminada! ################# ");

    //     int number = 999;

    //     try {                 // ## verifica se a entrada é valida, caso nao, entra no catch para tratamento ## // 
    //         System.out.println("Digite um número: ");
    //         number = input.nextInt();
    //     }catch(InputMismatchException a){
    //         number = 600;
    //     }catch(Exception e){ // ## utilizando para tratar uma excecao, erro ## //
    //         //System.out.println("Ocorreu um erro");
    //         number = 0;
    //     }finally {           // ## finally sempre será executado - uso nao obrigatorio ## //
    //         System.out.println("O número digitado foi: "+number);
    //         System.out.println("Execução terminada!");
    //         input.close();   // ## fecha a entrada do input - nao aceita mais dados ## //
    //     }
    // }    
    }
}
class Glass {
    
    protected int capacity; // quantidade ML
    protected int liquid;   // quantidade ML

    public Glass(int capacity) throws IllegalArgumentException{  // ## construtor ## //
        this.capacity = capacity;
        this.liquid = 0;
    }
    public void fill(int quantity){
        if(quantity < 0){ // ## criação da expection ## //
            IllegalArgumentException error = new IllegalArgumentException("Não existe essa quantidade. Verificar!");
            throw error;
        }

        int total;
        if(quantity + this.liquid > capacity){
            total = capacity;
        }else{
            total = quantity + this.liquid;
        }
            this.liquid = total;

            System.out.println(" ################### Encher executado! ################### ");
    }
}
    class GlassThermic extends Glass implements Utilities{

        protected int temperature;

        public GlassThermic(int capacity, int temperature){
            super(capacity);
            this.temperature = temperature;
        }

        @Override // ## subescreve o método pai (anotacao) ## //
        public String descripton(){
            return (
                "É um copo térmico com "+this.capacity+
                "ml de capacidade e nele contém "+this.liquid+
                "ml de liquído, em que ele guarda a "+this.temperature+
                " graus celcius"
            );
        }
    }
        interface Utilities {
            public String descripton();
}




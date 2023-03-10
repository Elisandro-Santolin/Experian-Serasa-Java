public class App {
    public static void main(String[] args) throws Exception {
    
    int[] myArray = new int[4]; // ## array em java tem tamanho fixo e guarda somente um tipo de valor EX: INTEIRO ## //
    myArray[0] = 32;
    myArray[1] = 22;
    myArray[2] = 672;
    myArray[3] = 328;
    
    String [] stringArray = {"batata", "repolho", "tomate", "alho"};


    for (int i = 0; i < stringArray.length; i++) {
        System.out.println();
    }
    for (int i = 0; i < myArray.length; i++) {
        System.out.println(myArray[i]);
    }
    }
}

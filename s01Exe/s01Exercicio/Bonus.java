package s01Exercicio;

public class Bonus {
    public static void main(String[] args) {

        int x = (int)(Math.random() * 1000);

        if(x <= 10 && x > 0){
            System.out.println("Woof-woof");
        }else if (x <= 100) {
            System.out.println("au, au");
        }else if (x <= 200 && x > 100) {
            System.out.println("bau, bau");
        }else if (x <= 300 && x > 200) {
            System.out.println("vogh, vogh");
        }else if (x <= 400 && x > 300) {
            System.out.println("ruff, ruff");
        }else if (x <= 500 && x > 400) {
            System.out.println("ruff, ruff");
        }else if (x <= 600 && x > 500) {
            System.out.println("arf, arf");
        }else {
            System.out.println("yap, yap");
        }

    }
} 
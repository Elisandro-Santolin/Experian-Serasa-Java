package enumerators;

public enum MoneyEnum{
        BEIJAFLOR(1,   "Beija-flor-de-peito-roxo"),
        TARTARUGA(2,   "Tartaruga-de-pente"),
        GARCA    (5,   "Garça-branca-grande"),
        ARARA    (10,  "Arara-vermelha-grande"),
        MICO     (20,  "Mico-leão-dourado"),
        ONCA     (50,  "Onça-pintada"),
        GAROUPA  (100, "Garoupa"),
        LOBO     (200, "Lobo-guará");
    
        private int value;  // ## USA SOMENTE NA MESMA CLASSE, NÃO INICIAR O OBJETO -- NEW VALUE (X NÃO PODE PRIVATE) ## //
        private String animal;
        
    
        public String getAnimal() {
            return animal;
        }
    
        public int getValue() {
            return value;
        }
    
        private MoneyEnum(int value, String animal){
            this.value = value;
            this.animal = animal;
        }
    }
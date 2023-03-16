public class Character {
    protected int cons;
    protected int stre;
    protected int inte;
    protected int lifeMax;
    protected int lifeNow;

    protected  Character(){
        System.out.println("########## Personagem criado com o construtor (no-args) ##########");
    }

    public Character(int cons, int stre, int inte) {
        System.out.println("########## Personagem criado com o construtor (cons, stre, inte) ##########");
        this.cons = cons;
        this.stre = stre;
        this.inte = inte;
        this.lifeMax = (int)(cons * 2);
        this.lifeNow = (int)(cons * 2);
    }
        public int getLifeMax() {
            return lifeMax;
        }
    
        public void setLifeMax(int lifeMax) {
            this.lifeMax = lifeMax;
        }

        public void type(){
            System.out.println("Personagem");
        }
        class Mage extends Character {
            public Mage(int cons, int stre, int inte) {
            super();
            this.cons = cons;
            this.stre = stre;
            this.inte = inte;
            this.lifeMax = (int)(cons * 2);
            this.lifeNow = (int)(cons * 2);

            System.out.println("########## Mago criado com o construtor (cons, stre, inte) ##########");

            // super(cons, stre, inte); // ## CHAMAR O CONSTRUTOR PAI ## //
            // this.lifeMax = (int)(cons * 5);          // ## RUIM, MÁ PRÁTICA ## //
            // this.lifeNow = (int)(cons * 5);
        }
            @Override
            public void type() {
                super.type();
                super.type();
                super.type();
                super.type();
                super.type();
        }  
    }
}


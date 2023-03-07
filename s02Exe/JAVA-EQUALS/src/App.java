public class App {
    public static void main(String[] args) throws Exception {
        Person will     = new Person("Will", "Turner", "red", "silver", "green", 'M', 120f, 15f); // ## OBJETO ## //
        Person will_2   = new Person("Will", "Turner", "red", "silver", "green", 'M', 120f, 14f); // ## OBJETO ## //
        Person will_3   = new Person("Will", "Turner", "red", "silver", "green", 'M', 120f, 15f); // ## OBJETO ## //
        Person maria    = new Person("Maria", "Silva", "red", "silver", "green", 'M', 120f, 15f); // ## OBJETO ## //
        
        System.out.println(maria.toString());
        System.out.println(will.hashCode());
        System.out.println(will_2.equals(will_3));
        
        will_3.setAge(40);
        maria.setAge(1995, 2023);
        System.out.println(maria.toString());
        System.out.println(will_3.toString());
    
    }

}

class Person{

    /**
     * Propriedades das caracteristicas de uma pessoa 
     */
    private String name, lastName, eyeColor, hariColor, skinColor;
    private char gender;
    private float weight, height;
    private int age;

    public int getAge() {
        return age;
    }


    public void setAge(int age) { // ## mesmo método ## //
        this.age = age;
    }

    public void setAge(int birth, int year) {  // ## isso é chamado de overload (objeto é pessoa) ## //
        this.age = birth - year;
    }


    public String getName() { // ## Getters and Setters criados com o command (.) - define a propriedade do name  ## //
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String lastName, String eyeColor, String hariColor, String skinColor, char gender, // ## usado o atalho command (.) mais ações escolher >> constructor << >> getters e setters << ## //
            float weight, float height) {
        this.name      = name;
        this.lastName  = lastName;
        this.eyeColor  = eyeColor;
        this.hariColor = hariColor;
        this.skinColor = skinColor;
        this.gender    = gender;
        this.weight    = weight;
        this.height    = height;
    }

    // ## hashcode + equals gerados com command (.) mais ações hashcode and equals ## //

    @Override
    public int hashCode() { // ## todo objeto tem um hascode, retorna um numero inteiro - exclusivo de cada objeto (termina a igualdade) ## //
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null)      ? 0 : name.hashCode());       // ## EXPRESSÃO LAMBDA ## //
        result = prime * result + ((lastName == null)  ? 0 : lastName.hashCode());   // ## EXPRESSÃO LAMBDA ## //
        result = prime * result + ((eyeColor == null)  ? 0 : eyeColor.hashCode());   // ## EXPRESSÃO LAMBDA ## //
        result = prime * result + ((hariColor == null) ? 0 : hariColor.hashCode());  // ## EXPRESSÃO LAMBDA ## //
        result = prime * result + ((skinColor == null) ? 0 : skinColor.hashCode());  // ## EXPRESSÃO LAMBDA ## //
        result = prime * result + gender;
        result = prime * result + Float.floatToIntBits(weight);
        result = prime * result + Float.floatToIntBits(height);
        return result;
    }

    @Override
    public boolean equals(Object obj) { // ##    ## //
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (eyeColor == null) {
            if (other.eyeColor != null)
                return false;
        } else if (!eyeColor.equals(other.eyeColor))
            return false;
        if (hariColor == null) {
            if (other.hariColor != null)
                return false;
        } else if (!hariColor.equals(other.hariColor))
            return false;
        if (skinColor == null) {
            if (other.skinColor != null)
                return false;
        } else if (!skinColor.equals(other.skinColor))
            return false;
        if (gender != other.gender)
            return false;
        if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
            return false;
        if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
            return false;
        return true;
    }

    @Override
    public String toString() {  // ## pega propriedade == valor e deixa pronto para imprimir com o a funcao nativa .toString()## //
        return "Person [name=" + name + ", lastName=" + lastName + ", eyeColor=" + eyeColor + ", hariColor=" + hariColor
                + ", skinColor=" + skinColor + ", gender=" + gender + ", weight=" + weight + ", height=" + height
                + ", age=" + age + "]";
    } 
}



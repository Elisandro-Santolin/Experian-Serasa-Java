import enumerators.StatesEnum;

public class App {
    public static void main(String[] args) throws Exception {
        Person jhon = new Person("Jhon", "Travolta", 'M', 34, "123445556", "Sim", "12345213"); // ## MÉTODO ## // // ## antes de gerar os equals e hashCodes criar o método - criado usando command . ## //
        System.out.println("################## INICIO DA EXECUÇÃO  ################## ");
        jhon.setCpf("11144477735");
        System.out.println(jhon.toString());
        System.out.println("##################  FINAL DA EXECUÇÃO  ################## ");
    }
}
       //     _ +-------------------------------------------+ _
        //     /o)|              				             |(o\
        //    / / |				    JAVA DOCS 	    	     | \ \
        //   ( (_ |  _     							      _  | _) )
        //  ((\ \)+-/o)-----------------------------------(o\-+(/ /))
        //  (\\\ \_/ /                                     \ \_/ ///)
        //   \      /                                       \      /
        //    \____/                                         \____/
        
/**
 * Uma classe que serve para representar uma pessoa.
 * @param name é o nome da pessoa;
 * @param lastname é o sobrenome da pessoa;
 * @param cpf O cpf da pessoal, ele tem que ser validade com o método <a href="#{@link}}"> {@link Person#setCpf}
 * @author Turma T3;
 */

    class Person {
        private String  name;
        private String  lastname;
        private char    gender;
        private int     age;
        private String  cpf;
        private String  married;
        private String  cep;
        private StatesEnum birthState;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {

        //     _ +-------------------------------------------+ _
        //     /o)|              				             |(o\
        //    / / |				  VALIDACAO CPF  	    	 | \ \
        //   ( (_ |  _     							      _  | _) )
        //  ((\ \)+-/o)-----------------------------------(o\-+(/ /))
        //  (\\\ \_/ /                                     \ \_/ ///)
        //   \      /                                       \      /
        //    \____/                                         \____/
        

            String cpfChecker = cpf.substring(0, 9);
            int multiplierNumber;
            int resultTotal;

            resultTotal = 0;
            multiplierNumber = 10;
            for (int i = 0; i < cpfChecker.length(); i++) {
                int myDigit = Character.getNumericValue(cpfChecker.charAt(i)); // ## retorna a posicao do index ## //
                resultTotal += myDigit * multiplierNumber;
                multiplierNumber--;
            }
            if(resultTotal%11 < 2){ // ## se o resto de resultTotal for menos que 2 entao o digito add é 0 ## //
                cpfChecker = cpfChecker + "0";
                

            }else { // ##  senao o digito adicionado é 11 menos o resto de resultTotal ## //
                cpfChecker = cpfChecker + (11 - resultTotal%11);
            }
            resultTotal = 0;
            multiplierNumber = 11;
            for (int i = 0; i < cpfChecker.length(); i++) {
                int myDigit = Character.getNumericValue(cpfChecker.charAt(i)); // ## retorna a posicao do index ## //
                resultTotal += myDigit * multiplierNumber;
                multiplierNumber--;
            }
            if(resultTotal%11 < 2){ // ## se o resto de resultTotal for menos que 2 entao o digito add é 0 ## //
                cpfChecker = cpfChecker + "0";
                

            }else { // ##  senao o digito adicionado é 11 menos o resto de resultTotal ## //
                cpfChecker = cpfChecker + (11 - resultTotal%11);
            }
            // ##  verifica se os cpfs(String) são iguais: ## //
            if(!(cpf.equals(cpfChecker))){
                throw new IllegalArgumentException("CPF Inválido");
            }
            this.cpf = cpf; 
        }

        public String getMarried() {
            return married;
        }

        public void setMarried(String married) {
            this.married = married;
        }

        /**
         * Retorna o cep da pessoa
         * @return o cep da pessoa
         */
        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            if(cep == null){
                throw new IllegalArgumentException("CEP Inválido: CEP não pode ser nulo");
            }
            int cepSize = cep.length();
            if(cepSize != 8){
                    throw new IllegalArgumentException("CEP Inválido: CEP Incompleto"); // ## enviar o erro para o usuário. retorna o erro e para a aplicacao ## //
                }  
            for (int i = 0; i < cepSize; i++) {
                char mychar = cep.charAt(i);
                if(!(mychar >= 48 && mychar <= 57)){
                    throw new IllegalArgumentException("CEP Inválido: CEP somente deve conter números");
                }    
            }
            this.cep = cep;
        }

        public Person(String name, String lastname, char gender, int age, String cpf, String married, String cep) { // ## construtor ## //
            try {
            this.name =     name;
            this.lastname = lastname;
            this.gender =   gender;
            this.age =      age;
            this.cpf =      cpf;
            this.married =  married;
            this.setCep(cep);
                
            } catch (Exception e) {
                throw new IllegalArgumentException("Verifique as informações inseridas");
            }
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
            result = prime * result + gender;
            result = prime * result + age;
            result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
            result = prime * result + ((married == null) ? 0 : married.hashCode());
            result = prime * result + ((cep == null) ? 0 : cep.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
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
            if (lastname == null) {
                if (other.lastname != null)
                    return false;
            } else if (!lastname.equals(other.lastname))
                return false;
            if (gender != other.gender)
                return false;
            if (age != other.age)
                return false;
            if (cpf == null) {
                if (other.cpf != null)
                    return false;
            } else if (!cpf.equals(other.cpf))
                return false;
            if (married == null) {
                if (other.married != null)
                    return false;
            } else if (!married.equals(other.married))
                return false;
            if (cep == null) {
                if (other.cep != null)
                    return false;
            } else if (!cep.equals(other.cep))
                return false;
            return true;
        }

        @Override
        public String toString() { // ## método .toString ## //
            return "PessoaFisica [name = " + name + ", lastname = " + lastname + ", gender = " + gender + ", age = " + age
                    + ", cpf = " + cpf + ", married = " + married + ", cep = " + cep + "]";
    }       
}  


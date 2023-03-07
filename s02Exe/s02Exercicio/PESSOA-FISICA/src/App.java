public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica jhon = new PessoaFisica("Jhon", "Travolta", 'M', 56,1111111159, "Sim", 45678); // ## MÉTODO ## // // ## antes de gerar os equals e hashCodes criar o método - criado usando command . ## //
        System.out.println("################## INICIO DA EXECUÇÃO  ################## ");
        System.out.println(jhon.toString());
        System.out.println("##################  FINAL DA EXECUÇÃO  ################## ");
    }
}
    class PessoaFisica {
        private String  name;
        private String  lastname;
        private char    gender;
        private int     age;
        private int     cpf;
        private String  married;
        private int     cep;


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

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public String getMarried() {
            return married;
        }

        public void setMarried(String married) {
            this.married = married;
        }

        public int getCep() {
            return cep;
        }
        protected int validaCep;

        public void validaCep(int cep){
            if(cep <= 0){ // ## criação da expection ## //
                IllegalArgumentException error = new IllegalArgumentException("CEP Inválido. Verificar!");
                throw error;
            }
        }

        public void setCep(int cep) {
            this.cep = cep;
        }

        public PessoaFisica(String name, String lastname, char gender, int age, int cpf, String married, int cep) { // ## construtor ## //
            this.name =     name;
            this.lastname = lastname;
            this.gender =   gender;
            this.age =      age;
            this.cpf =      cpf;
            this.married =  married;
            this.cep =      cep;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
            result = prime * result + gender;
            result = prime * result + age;
            result = prime * result + cpf;
            result = prime * result + ((married == null) ? 0 : married.hashCode());
            result = prime * result + cep;
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
            PessoaFisica other = (PessoaFisica) obj;
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
            if (cpf != other.cpf)
                return false;
            if (married == null) {
                if (other.married != null)
                    return false;
            } else if (!married.equals(other.married))
                return false;
            if (cep != other.cep)
                return false;
            return true;
        }

        @Override
        public String toString() { // ## método .toString ## //
            return "PessoaFisica [name = " + name + ", lastname = " + lastname + ", gender = " + gender + ", age = " + age
                    + ", cpf = " + cpf + ", married = " + married + ", cep = " + cep + "]";
    }       
}  


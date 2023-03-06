public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



    class PessoaFisica {
        private String name;
        private String lastname;
        private String gender;
        private int age;
        private int cpf;
        private String married;
        private int cep;



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

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getcpf() {
            return cpf;
            if(cpf == 8){
                return cpf;
            }try {
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        public void setcpf(int cpf) {
            cpf = cpf;
        }

        public String getMarried() {
            return married;
        }

        public void setMarried(String married) {
            this.married = married;
        }

        public int getcep() {
            return cep;
        }

        public void setcep(int cep) {
            cep = cep;
        }

        public PessoaFisica(String name, String lastname, String gender, int age, int cpf, String married, int cep) { // ## construtor ## //
            this.name = name;
            this.lastname = lastname;
            this.gender = gender;
            this.age = age;
            this.cpf = cpf;
            this.married = married;
            this.cep = cep;
        }  

        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }
        @Override
        public int hashCode() {
            // TODO Auto-generated method stub
            return super.hashCode();
        }
    }
    
    }
}

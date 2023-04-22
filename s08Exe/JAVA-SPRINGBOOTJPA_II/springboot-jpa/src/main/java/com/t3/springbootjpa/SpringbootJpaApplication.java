package com.t3.springbootjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Bean // ## VERIFICAR O QUE É ## //
	public CommandLineRunner demo(FuncionarioRepository repository){
		return(args)-> {
			
			repository.save(new Funcionario("Marcelo", "Lima"));
			repository.save(new Funcionario("Mariana", "Souza"));
			repository.save(new Funcionario("Luiz", "Marinho"));
			repository.save(new Funcionario("Leticia", "Campos"));

			log.info("Imprimir todos os Funcionarios");
			for(Funcionario funcionario : repository.findAll()) {
				log.info(funcionario.toString());
			}


			repository.deleteById(1L); // método //

			Funcionario funcionarioById = repository.findById(3L);
			log.info("Encontrando um Funcionario por Id:");
			log.info(funcionarioById.toString());

			
		};
	}

}

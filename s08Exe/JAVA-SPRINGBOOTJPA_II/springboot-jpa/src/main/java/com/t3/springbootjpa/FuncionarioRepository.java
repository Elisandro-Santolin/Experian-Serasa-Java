package com.t3.springbootjpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
    
    Funcionario findById(long id);

    Long deleteById(long id);

    Long deleteByFirstName(String firstName);

    List<Funcionario> findByFirstName(String firstName);

    @Query ("SELECT f FROM Funcionario f WHERE LOWER(f.firstName) = LOWER(:firstName)") // ## comentário ## //
     Funcionario retrieveByName(@Param("firstName") String firstName);

}

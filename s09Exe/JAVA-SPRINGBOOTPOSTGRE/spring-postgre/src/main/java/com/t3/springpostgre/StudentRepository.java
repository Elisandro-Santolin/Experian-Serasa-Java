package com.t3.springpostgre;

import org.springframework.data.jpa.repository.JpaRepository;

                // ## CrudRepository <tipo da propriedade setada como id> ## //
public interface StudentRepository extends JpaRepository<Student, Long> {

    
}

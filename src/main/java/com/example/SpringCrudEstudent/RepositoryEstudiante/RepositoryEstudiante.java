package com.example.SpringCrudEstudent.RepositoryEstudiante;

import com.example.SpringCrudEstudent.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstudiante extends JpaRepository<Estudiante, Long> {



}

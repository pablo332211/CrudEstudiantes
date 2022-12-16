package com.example.SpringCrudEstudent;

import com.example.SpringCrudEstudent.Entity.Estudiante;
import com.example.SpringCrudEstudent.RepositoryEstudiante.RepositoryEstudiante;
import com.example.SpringCrudEstudent.Service.ServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudEstudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudEstudentApplication.class, args);
	}

	@Autowired
	RepositoryEstudiante repositoryEstudiante;

	@Override
	public void run(String... args) throws Exception {
		//Estudiante estudiante1 = new Estudiante("pablo", "noguera", "pablo.noguera@hotmail.com");
		//repositoryEstudiante.save(estudiante1);
		//Estudiante estudiante2 = new Estudiante("julian", "mercedez", "oscar@hotmail.com");
		//repositoryEstudiante.save(estudiante2);
	}
}

package com.example.SpringCrudEstudent.Service;

import com.example.SpringCrudEstudent.Entity.Estudiante;
import com.example.SpringCrudEstudent.RepositoryEstudiante.RepositoryEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEstudianteIMPL  implements ServiceEstudiante{

    @Autowired
    private RepositoryEstudiante repositoryEstudiante;


    @Override
    public List<Estudiante> listarTodosLosEstudiante() {
        return repositoryEstudiante.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositoryEstudiante.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiante(Long id) {
        return repositoryEstudiante.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return repositoryEstudiante.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {

        repositoryEstudiante.deleteById(id);

    }

}

package com.example.SpringCrudEstudent.Service;

import com.example.SpringCrudEstudent.Entity.Estudiante;


import java.util.List;

public interface ServiceEstudiante {

    public List<Estudiante> listarTodosLosEstudiante();

    public  Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiante(Long id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public  void  eliminarEstudiante(Long id);
}

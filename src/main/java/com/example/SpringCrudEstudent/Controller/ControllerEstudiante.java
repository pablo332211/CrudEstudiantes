package com.example.SpringCrudEstudent.Controller;

import com.example.SpringCrudEstudent.Entity.Estudiante;
import com.example.SpringCrudEstudent.RepositoryEstudiante.RepositoryEstudiante;
import com.example.SpringCrudEstudent.Service.ServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerEstudiante {

    @Autowired
    ServiceEstudiante serviceEstudiante;

    //para mostrar lista de estudiante
    @GetMapping({"/estudiantes", "/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes", serviceEstudiante.listarTodosLosEstudiante());
        return "estudiantes";
    }

    //metodo mostrar el formulario para rellenar
    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioregistro(Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    //metodo crear estudiante
    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        serviceEstudiante.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    //metodo para mostrar formulario con datos estudiantes
    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormulario(@PathVariable Long id, Model model){
        model.addAttribute("estudiante", serviceEstudiante.obtenerEstudiante(id));
        return "editar_estudiante";

    }

    //metodo para actualizar datos del estudiante
    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model model){
        Estudiante estudianteExistente = serviceEstudiante.obtenerEstudiante(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApaellido(estudiante.getApaellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        serviceEstudiante.actualizarEstudiante(estudiante);
        return "redirect:/estudiantes";

    }

    //metodo para eliminar estudiante
    @GetMapping("estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        serviceEstudiante.eliminarEstudiante(id);

        return "redirect:/estudiantes";

    }



}

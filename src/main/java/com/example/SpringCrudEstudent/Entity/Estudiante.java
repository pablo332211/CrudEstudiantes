package com.example.SpringCrudEstudent.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apaellido", nullable = false, length = 50)
    private String apaellido;

    @Column(name = "email", nullable = false, length = 50,unique = true)
    private String email;

    public Estudiante() {}

    public Estudiante(Long id, String nombre, String apaellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apaellido = apaellido;
        this.email = email;
    }


    public Estudiante(String nombre, String apaellido, String email) {
        this.nombre = nombre;
        this.apaellido = apaellido;
        this.email = email;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaellido() {
        return apaellido;
    }

    public void setApaellido(String apaellido) {
        this.apaellido = apaellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apaellido='" + apaellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

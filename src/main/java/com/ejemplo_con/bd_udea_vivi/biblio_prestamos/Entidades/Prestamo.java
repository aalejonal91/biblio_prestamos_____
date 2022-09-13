package com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Entidades;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name="Prestamo")
public class Prestamo {
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_prestamo;
    @ManyToOne
    @JoinColumn(name = "documento")
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;
    @Column(nullable=false)
    private Calendar fecha;

    public Prestamo() {
    }

    public Prestamo(int id_prestamo, Estudiante estudiante, Libro libro, Calendar fecha) {
        this.id_prestamo = id_prestamo;
        this.estudiante = estudiante;
        this.libro = libro;
        this.fecha = fecha;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id_prestamo=" + id_prestamo +
                ", estudiante='" + estudiante + '\'' +
                ", libro='" + libro + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

package com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Servicios;

import com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Entidades.Libro;
import com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Repositorio.Libro_repositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibroServicio {
    private Libro_repositorio repositorio ;

    public LibroServicio(Libro_repositorio repositorio) {
        this.repositorio = repositorio;
    }
    public ArrayList<Libro> listarlibros(){ //consultar todos los libros
        return (ArrayList<Libro>) repositorio.findAll();
    }
}

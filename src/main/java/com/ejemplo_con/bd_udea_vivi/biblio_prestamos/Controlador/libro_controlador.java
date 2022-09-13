package com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Controlador;

import com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Entidades.Libro;
import com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Servicios.LibroServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class libro_controlador {
    private LibroServicio servicio;

    public libro_controlador(LibroServicio servicio) {
        this.servicio = servicio;
    }
    @GetMapping("/listarlibros")
    public ArrayList<Libro>listar(){
        return servicio.listarlibros();
    }
}

package com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Repositorio;

import com.ejemplo_con.bd_udea_vivi.biblio_prestamos.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Libro_repositorio extends JpaRepository<Libro,String> {

}


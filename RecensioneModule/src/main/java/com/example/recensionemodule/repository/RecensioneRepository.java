package com.example.recensionemodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.recensionemodule.entity.Recensione;

import java.util.List;

@Repository
public interface RecensioneRepository extends JpaRepository<Recensione,Long>{

    @Query(value = "SELECT * FROM Recensione r  WHERE r.id_articolo = :idArticoloo",nativeQuery = true)
    List<Recensione> findAllByIdArticolo(@Param("idArticoloo") Long idArticoloo);
}

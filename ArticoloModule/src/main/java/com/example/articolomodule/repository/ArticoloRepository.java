package com.example.articolomodule.repository;

import com.example.articolomodule.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticoloRepository extends JpaRepository<Articolo,Long> {
    @Query(value = "SELECT titolo_articolo FROM Articolo WHERE articolo=:idArticolo",nativeQuery = true)
    public String getTitoloArticoloById(@Param("idArticolo")Long idArticolo);
}

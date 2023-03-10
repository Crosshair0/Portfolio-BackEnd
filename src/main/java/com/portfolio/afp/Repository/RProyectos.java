/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.afp.Repository;

import com.portfolio.afp.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sergio
 */
@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>  {
    public Optional<Proyectos> findByNombreP (String nombreP);
    public Optional<Proyectos> findByDescripcionP (String descripcionP);
    public Optional<Proyectos> findByImg (String img);
    public Optional<Proyectos> findByUrlP (String urlP);
    public boolean existsByNombreP (String nombreP);
    public boolean existsByDescripcionP (String descripcionP);
    public boolean existsByImg(String img);
    public boolean existsByUrlP(String urlP);
}

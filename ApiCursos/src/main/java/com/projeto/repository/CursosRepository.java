package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.entites.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {

}
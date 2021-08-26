package com.example.testecassianodess.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testecassianodess.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}

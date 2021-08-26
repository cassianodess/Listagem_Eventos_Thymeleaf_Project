package com.example.testecassianodess.configuration;

import com.example.testecassianodess.model.Evento;
import com.example.testecassianodess.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventoConfig implements CommandLineRunner{

    @Autowired
    private EventoRepository repo;

    @Override
    public void run(String... args) throws Exception{

        Evento e1 = new Evento("Show Michael Jackson", "Brasil", "27/06/2021", "14:30");
        Evento e2 = new Evento("Show Chris Brown", "Brasil", "27/06/2021", "15:30");
        repo.saveAll(List.of(e1, e2));

    }

}

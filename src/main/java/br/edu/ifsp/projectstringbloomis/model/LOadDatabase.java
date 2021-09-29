package br.edu.ifsp.projectstringbloomis.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LOadDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(LOadDatabase.class);

    @Bean
    CommandLineRunner initDataBase(UsuarioRepository repository, LugarRepository repository2){

        return args ->{

            Usuario usuario1 = new Usuario("Yasmin", "y.yasminrmg7@gmail.com", "123","02/09/2003", "F");
            Usuario usuario2 = new Usuario("Maria Clara", "mariaclara@gmail.com", "1233","26/04/2005", "F");
            Lugar lugar1 = new Lugar("Shopping", "3.7", "Rua nanana");
            Lugar lugar2 = new Lugar("Pizzaria gente fina", "4.7", "Rua tchubiraudau");

            log.info("inserindo: " + repository2.save(lugar1));
            log.info("inserindo: " + repository2.save(lugar2));

            log.info("inserindo: " + repository.save(usuario1));
            log.info("inserindo: " + repository.save(usuario2));
        };
    }

    



}

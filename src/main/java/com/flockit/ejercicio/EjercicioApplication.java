package com.flockit.ejercicio;

import com.flockit.ejercicio.entities.Usuario;
import com.flockit.ejercicio.repositories.UsuarioRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateDB(UsuarioRepository repo) {
		
		return args -> {
			Usuario usuario = new Usuario();
			usuario.setPassword("password");
			usuario.setUsername("username");
			repo.save(usuario);
		};
	}

}
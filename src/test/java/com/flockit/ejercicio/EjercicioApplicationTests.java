package com.flockit.ejercicio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.flockit.ejercicio.entities.Usuario;
import com.flockit.ejercicio.repositories.UsuarioRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EjercicioApplicationTests {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void getUsuarioByName() {
		Usuario usuario = usuarioRepository.findByUsername("username");
		assertTrue(usuario.getPassword().equals("password"));
	}

	@Test
	void getUsuarioByNameFailed() {
		Usuario usuario = usuarioRepository.findByUsername("username");
		assertFalse(usuario.getPassword().equals("contraseñaErronea"));
	}
	
}

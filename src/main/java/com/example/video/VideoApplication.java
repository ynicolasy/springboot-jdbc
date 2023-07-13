package com.example.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.videojuego.model.Personaje;

import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;

@SpringBootApplication
@RestController
public class VideoApplication {

	static Logger logger = LogManager.getLogger(VideoApplication.class);

	public static void main(String[] args) {
		logger.info("Ingresa al main");
		SpringApplication.run(VideoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message with name");
		logger.info(name);
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		return String.format("Hello %s!", name);
	}

	@GetMapping("/listado")
	public String listado(@RequestParam(value = "list", defaultValue = "world") String name) {
		logger.info("An INFO Message with name");
		List<Personaje> lista = new ArrayList();
		Personaje p1 = new Personaje();
		p1.setNombre("Personaje1");
		p1.setPuntosAtaque(44);
		p1.setPuntosDefensa(44);
		p1.setTipo("Tipo");
		lista.add(p1);
		logger.info(name);
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		return String.format("Hello %s!", name);
	}

}
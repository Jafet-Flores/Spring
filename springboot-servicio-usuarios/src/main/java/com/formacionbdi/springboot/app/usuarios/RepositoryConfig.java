package com.formacionbdi.springboot.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Role;
import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Usuario;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}

}

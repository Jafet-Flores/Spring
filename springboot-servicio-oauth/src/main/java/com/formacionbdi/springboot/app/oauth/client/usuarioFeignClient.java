package com.formacionbdi.springboot.app.oauth.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formacionbdi.springboot.app.usuarios.commons.models.entity.Usuario;

@FeignClient(name="servicio-usuarios")
public interface usuarioFeignClient {

	@GetMapping("/usuarios/search/buscar-username")
	public Usuario findByUserName(@RequestParam String username);
}

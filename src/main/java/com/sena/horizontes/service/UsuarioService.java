package com.sena.horizontes.service;

import com.sena.horizontes.entities.Usuario;
import com.sena.horizontes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void guardarUsuario(Usuario usuario) {
    	usuario.setEstado(1);
        usuarioRepository.save(usuario);
    }

}

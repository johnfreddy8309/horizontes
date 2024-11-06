package com.sena.horizontes.controller;


import com.sena.horizontes.entities.Autor;
import com.sena.horizontes.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping("/autores")
    public String listarTodosAutores(Model model) {
        List<Autor> autores = service.listarTodosAutores();
        model.addAttribute("autores", autores);
        return "autores/listar_autores"; // Nombre de la plantilla Thymeleaf }

    }
}
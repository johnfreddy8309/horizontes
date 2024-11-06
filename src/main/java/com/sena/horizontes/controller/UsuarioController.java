package com.sena.horizontes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sena.horizontes.entities.Departamento;
import com.sena.horizontes.entities.Municipio;
import com.sena.horizontes.entities.TipoIdentificacion;
import com.sena.horizontes.entities.Usuario;
import com.sena.horizontes.service.DepartamentoService;
import com.sena.horizontes.service.MunicipioService;
import com.sena.horizontes.service.TipoIdentificacionService;
import com.sena.horizontes.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    @Autowired
    private DepartamentoService departamentoService;
    
    @Autowired
    private MunicipioService municipioService;

    @GetMapping("/nuevo")
    public String mostrarFormularioRegistro(Model model) {
        List<TipoIdentificacion> tiposIdentificacion = tipoIdentificacionService.listarTodosIdentificacion();
        List<Departamento> departamentos = departamentoService.listarTodosDepartamento();
        System.out.println("tiposIdentificacion: " + tiposIdentificacion);
        System.out.println("Departamentos: " + departamentos);
        model.addAttribute("tiposIdentificacion", tiposIdentificacion);
        model.addAttribute("departamentos", departamentos);
        model.addAttribute("usuario", new Usuario());
        return "usuario/guardar_usuario";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
        return "redirect:/inicio";
    }
    
    @GetMapping("/municipios")
    @ResponseBody
    public List<Municipio> obtenerMunicipios(@RequestParam int departamentoId) {
        return municipioService.listarMunicipiosPorDepartamento(departamentoId);
    }

}

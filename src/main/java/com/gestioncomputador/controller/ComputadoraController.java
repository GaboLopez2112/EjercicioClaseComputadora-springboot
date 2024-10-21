package com.gestioncomputador.controller;

import com.gestioncomputador.model.Computadora;
import com.gestioncomputador.repository.ComputadoraRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class ComputadoraController {
    @Autowired
    private ComputadoraRespository computadoraRespository;

    @GetMapping
    public String home (){
        return "redirect:/computadora";
    }
    @GetMapping("/computadora")
    public String listarComputadoramodel(Model model){
        List<Computadora> computadora = computadoraRespository.findAll();
        computadora = computadoraRespository.findAll();
        model.addAttribute("computadora",computadora);
        return "computadora";
    }
    @GetMapping("/computadora/nuevo")
    public String agregarComputadora(Model model){
        Computadora computadora = new Computadora();
        model.addAttribute("computadora",computadora);
        model.addAttribute("pageTitle","Nueva Computadora");
        return "computadora_form";
    }
    @PostMapping("/computadora/save")
    public String guardarComputadora(Computadora computadora, RedirectAttributes redirectAttributes) {
        try {
            computadoraRespository.save(computadora);
            redirectAttributes.addFlashAttribute("message", "El computador ha sido guardado con éxito");
        } catch (Exception e) {
            redirectAttributes.addAttribute("message", e.getMessage());
            e.printStackTrace();
        }
        return "redirect:/computadora";
    }
    
}


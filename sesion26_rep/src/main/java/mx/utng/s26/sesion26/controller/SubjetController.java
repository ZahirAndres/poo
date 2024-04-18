package mx.utng.s26.sesion26.controller;
/**
 * @autor Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @size 19/3/2024
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.s26.sesion26.model.entity.Subjet;
import mx.utng.s26.sesion26.model.service.ISubjetService;

@Controller
@SessionAttributes("subjet")
public class SubjetController {
    @Autowired 
    private ISubjetService service;

    @GetMapping({"subjet", "/subjet", "/subjet/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de profesores");
        model.addAttribute("subjets", service.list());
        return "subjet-list";
    }

    @GetMapping("/subjet/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de profesores");
        model.addAttribute("subjet", new Subjet());
        return "subjet-form";
    }

    @PostMapping("/subjet/form")
    public String save(@Valid Subjet subjet, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de profesores");
            return "subjet-form";
        }
        service.save(subjet);
        return "redirect:/subjet/list";
    }

    @GetMapping("/subjet/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Subjet subjet = null;
        if(id > 0){
            subjet=service.getByID(id);
        }else{
            return "redirect:/subjet/list";
        }
        model.addAttribute("title", "Editar profesores");
        model.addAttribute("subjet", subjet);
        return "subjet-form";
    }
    @GetMapping("/subjet/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/subjet/list";
    }

}

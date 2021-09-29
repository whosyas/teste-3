package br.edu.ifsp.projectstringbloomis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.projectstringbloomis.model.Lugar;
import br.edu.ifsp.projectstringbloomis.model.LugarRepository;

@RestController
public class LugarController {
    
    @Autowired
    LugarRepository lugarRepository;

    @GetMapping ("/lugares")
    public List<Lugar> getLugares(){
        return (List<Lugar>) lugarRepository.findAll();
    }
    @PostMapping ("/lugares/criar")
    public Lugar postLugar(@RequestBody Lugar lugar){
        return lugarRepository.save(lugar);
    }
    @PutMapping("/lugares/atualizar")
    public Lugar putLugar(@RequestBody Lugar lugaresAtualizados){
        return lugaresAtualizados;
    }

    @DeleteMapping("/lugares/remove/{id}")
    public String deleteLugar(@PathVariable("id") Long id){
        if(id == 1)
            return "Remoção de informação com id " + id + " realizada";
        else{
            return "Objeto para id " + id + " não encontrado";
}


}
}

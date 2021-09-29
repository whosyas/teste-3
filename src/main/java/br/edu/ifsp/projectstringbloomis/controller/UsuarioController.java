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

import br.edu.ifsp.projectstringbloomis.model.Usuario;
import br.edu.ifsp.projectstringbloomis.model.UsuarioRepository;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping ("/usuarios")
    public List<Usuario> getUsuarios(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
    @PostMapping ("/usuarios/cadastrar")
    public Usuario postUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    @PutMapping("/usuarios/atualizar")
    public Usuario putUsuario(@RequestBody Usuario usuariosAtualizados){
        return usuariosAtualizados;
    }

    @DeleteMapping("/usuarios/remove/{id}")
    public String deleteUsuario(@PathVariable("id") Long id){
        if(id == 1)
            return "Remoção de informação com id " + id + " realizada";
        else{
            return "Objeto para id " + id + "não encontrado";
}


}
}

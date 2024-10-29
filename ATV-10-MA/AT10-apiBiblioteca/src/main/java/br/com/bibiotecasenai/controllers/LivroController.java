package br.com.bibiotecasenai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibiotecasenai.entities.Livro;
import br.com.bibiotecasenai.services.LivroService;
 
@RestController
@RequestMapping("/Livro")
public class LivroController {
    
    @Autowired
    private LivroService LivroService;
    
    @PostMapping
    public Livro createLivro(Livro Livro) {
        return LivroService.saveLivro(Livro);
    }
    
    @GetMapping
    public List<Livro> getAllLivro(){
        return LivroService.getAllLivros();
    }
    @GetMapping ("/{id_livro}")
    public Livro getLivro(@PathVariable Long id_livro) {
        return LivroService.getLivroById(id_livro);
    }
    @DeleteMapping("/{id_livro}")
    public void deleteLivro (@PathVariable Long id_livro) {
        LivroService.deleteLivro(id_livro);
    }

}

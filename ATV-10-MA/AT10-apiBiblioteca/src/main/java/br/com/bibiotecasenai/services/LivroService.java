package br.com.bibiotecasenai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bibiotecasenai.entities.Livro;
import br.com.bibiotecasenai.repositories.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository LivroRepository;
    
    public Livro saveLivro(Livro Livro) {
        return LivroRepository.save(Livro);
    }
    
    public List<Livro> getAllLivros(){
        return LivroRepository.findAll();
    }
    public Livro getLivroById (Long id_livro) {
        return LivroRepository.findById(id_livro).orElse(null);
    }
    public void deleteLivro(Long id_livro) {
        LivroRepository.deleteById(id_livro);
    }
}
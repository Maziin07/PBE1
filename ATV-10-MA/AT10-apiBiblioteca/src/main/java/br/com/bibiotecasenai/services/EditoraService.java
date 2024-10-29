package br.com.bibiotecasenai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bibiotecasenai.entities.Editora;
import br.com.bibiotecasenai.repositories.EditoraRepository;

@Service
public class EditoraService {
    
    @Autowired
    private EditoraRepository EditoraRepository;
    
    public Editora saveEditora(Editora Editora) {
        return EditoraRepository.save(Editora);
    }
    
    public List<Editora> getAllEditoras(){
        return EditoraRepository.findAll();
    }
    public Editora getEditoraById (Long id_editora) {
        return EditoraRepository.findById(id_editora).orElse(null);
    }
    public void deleteEditora(Long id_editora) {
        EditoraRepository.deleteById(id_editora);
    }
}

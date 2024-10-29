package br.com.bibiotecasenai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibiotecasenai.controllers.EditoraController;

public interface EditoraRepository extends JpaRepository<EditoraController, Long>{

}

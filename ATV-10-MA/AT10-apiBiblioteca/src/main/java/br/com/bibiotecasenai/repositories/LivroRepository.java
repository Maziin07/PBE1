package br.com.bibiotecasenai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibiotecasenai.controllers.LivroController;

public interface LivroRepository extends JpaRepository<LivroController, Long>{

}

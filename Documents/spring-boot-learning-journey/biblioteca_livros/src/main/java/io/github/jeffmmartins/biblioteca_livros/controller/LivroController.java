package io.github.jeffmmartins.biblioteca_livros.controller;

import io.github.jeffmmartins.biblioteca_livros.model.Livro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livros")
public class LivroController {

    @PostMapping
    public void salvar ( @RequestBody Livro livro){
        System.out.println("Livro recebido: " + livro);
    }
}

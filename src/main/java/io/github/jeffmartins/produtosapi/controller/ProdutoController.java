package io.github.jeffmartins.produtosapi.controller;

import io.github.jeffmartins.produtosapi.model.Produto;
import io.github.jeffmartins.produtosapi.repository.ProdutoRepositoy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepositoy produtoRepositoy;

    public ProdutoController(ProdutoRepositoy produtoRepositoy) {
        this.produtoRepositoy = produtoRepositoy;
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido" + produto);
        //passando um id aleatório.
        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepositoy.save(produto);
    }
}

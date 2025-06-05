package io.github.jeffmartins.produtosapi.repository;

import io.github.jeffmartins.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositoy extends JpaRepository <Produto, String> {
}

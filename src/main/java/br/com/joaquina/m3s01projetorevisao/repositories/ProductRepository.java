package br.com.joaquina.m3s01projetorevisao.repositories;

import br.com.joaquina.m3s01projetorevisao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//repositório é para consultar, editar, apagar etc no banco de dados
public interface ProductRepository extends JpaRepository<Product, Long> {

}

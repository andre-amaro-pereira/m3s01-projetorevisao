package br.com.joaquina.m3s01projetorevisao.services;

import br.com.joaquina.m3s01projetorevisao.entities.Product;
import br.com.joaquina.m3s01projetorevisao.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
//regras de negócios ficam no services
//pois trabalhamos com a manutenção de tudo do projeto
//padrão MVC - model view controll
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) throws Exception {
        if (product.getName() == null || product.getName().isEmpty()){
            throw new Exception("Name is required!");
        }
        if (product.getPrice() == null || product.getPrice().compareTo(BigDecimal.ZERO) <= 0){
            throw new Exception("Price should be greater than ZERO!");
        }
        if (product.getQtyStock() == null || product.getPrice().compareTo(BigDecimal.ZERO) <= 0){
            throw new Exception("Quantity should be greater than ZERO!");
        }
         product = productRepository.save(product);

        return product;
    }
}

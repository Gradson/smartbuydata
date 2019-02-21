package br.com.metanoia.smartbuy.product.service

import br.com.metanoia.smartbuy.product.model.Product
import br.com.metanoia.smartbuy.product.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService @Autowired constructor(private val repository: ProductRepository){

    fun findAll(): List<Product> {
        return repository.findAll().toMutableList()
    }

    fun create(product: Product): Product {
        return repository.save(product)
    }
}

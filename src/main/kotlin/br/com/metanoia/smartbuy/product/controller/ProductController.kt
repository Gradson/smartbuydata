package br.com.metanoia.smartbuy.product.controller

import br.com.metanoia.smartbuy.product.model.Product
import br.com.metanoia.smartbuy.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v.0/products")
class ProductController @Autowired constructor(private val service: ProductService){

    @GetMapping
    @ResponseBody
    fun findAll(): MutableIterable<Product> {
        return service.findAll().toMutableList()
    }

    @PostMapping
    fun create(product: Product): Product {
        return service.create(product)
    }
}
package br.com.metanoia.smartbuy.product.repository

import br.com.metanoia.smartbuy.product.model.Product
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository

interface ProductRepository: PagingAndSortingRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}

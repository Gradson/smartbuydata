package br.com.metanoia.smartbuy.product.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Product(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
              val name: String) {
}
package br.com.metanoia.smartbuy

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class SmartBuyApplication

fun main(args: Array<String>) {
	runApplication<SmartBuyApplication>(*args)
}


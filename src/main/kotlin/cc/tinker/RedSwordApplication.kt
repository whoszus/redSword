package cc.tinker

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class RedSwordApplication

fun main(args: Array<String>) {
    SpringApplication.run(RedSwordApplication::class.java, *args)
}

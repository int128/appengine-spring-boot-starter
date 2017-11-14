package example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
open class App : SpringBootServletInitializer()

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}

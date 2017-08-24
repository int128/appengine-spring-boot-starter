package example

import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import java.time.LocalDateTime

val log = LoggerFactory.getLogger(HomeController::class.java)

@Controller
class HomeController {
    @GetMapping("/hello")
    fun index(model: Model, @RequestHeader(HttpHeaders.USER_AGENT) userAgent: String): String {
        log.debug("Got request from {}", userAgent)
        model.addAttribute("currentDateTime", LocalDateTime.now())
        return "hello"
    }
}

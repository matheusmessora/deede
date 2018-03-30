package deede.endpoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class IndexEndpoint {

    @GetMapping("/")
    fun index() = "This is home!"

}
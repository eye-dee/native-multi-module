package com.eyedee.rest

import com.eyedee.common.model.Something
import com.eyedee.common.service.CommonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/v1/something")
class SomeController(
    private val commonService: CommonService,
) {

    @GetMapping
    fun getSomething(): Flux<Something> =
        Flux.fromIterable(
            listOf(
                commonService.getSomething(),
                commonService.getSomething(),
                commonService.getSomething(),
                commonService.getSomething(),
            )
        )
}

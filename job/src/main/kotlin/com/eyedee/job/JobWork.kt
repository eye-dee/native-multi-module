package com.eyedee.job

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class JobWork: CommandLineRunner {
    private val log = LoggerFactory.getLogger(CommandLineRunner::class.java)

    override fun run(vararg args: String?) {
        log.info("start")
        Thread.sleep(10_000)
        log.info("stop")
    }
}

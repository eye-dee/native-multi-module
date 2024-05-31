package com.eyedee.nativemultimodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NativeMultiModuleApplication

fun main(args: Array<String>) {
	runApplication<NativeMultiModuleApplication>(*args)
}

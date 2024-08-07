package com.eyedee.common.config

import org.springframework.aot.hint.RuntimeHints
import org.springframework.aot.hint.RuntimeHintsRegistrar

class NativeRegistarHints: RuntimeHintsRegistrar {
    override fun registerHints(hints: RuntimeHints, classLoader: ClassLoader?) {
        hints.resources().registerPattern("**/*.yml")
        hints.resources().registerPattern("**/*.yaml")
        hints.resources().registerPattern("**/*.properties")
    }
}

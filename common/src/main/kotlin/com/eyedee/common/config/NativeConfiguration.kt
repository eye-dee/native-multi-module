package com.eyedee.common.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportRuntimeHints

@Configuration
@ImportRuntimeHints(
    value = [
        NativeRegistarHints::class,
    ]
)
class NativeConfiguration {
}

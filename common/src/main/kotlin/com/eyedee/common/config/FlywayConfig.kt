package com.eyedee.common.config

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class FlywayConfig(
    private val dataSource: DataSource,
) {

    @Bean
    fun flywayMigrationStrategy() = FlywayMigrationStrategy {
        it.validate()
    }
}

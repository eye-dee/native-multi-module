package com.eyedee.common.config

import org.flywaydb.core.Flyway
import org.flywaydb.database.postgresql.PostgreSQLConfigurationExtension
import org.springframework.boot.autoconfigure.flyway.FlywayProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@EnableConfigurationProperties(FlywayProperties::class)
@Configuration
class FlywayConfig {
    @Bean(initMethod = "migrate")
    fun flyway(flywayProperties: FlywayProperties): Flyway {
        return Flyway.configure()
            .dataSource(
                flywayProperties.url,
                flywayProperties.user,
                flywayProperties.password,
            )
            .baselineOnMigrate(true)
            .let { config ->
                config.pluginRegister.getPlugin(PostgreSQLConfigurationExtension::class.java)
                    .apply { isTransactionalLock = false }
                config
            }
            .load()
    }
}

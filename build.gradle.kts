import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("idea")
	id("org.springframework.boot") version "3.3.0" apply false
	id("io.spring.dependency-management") version "1.1.5"

	id("org.graalvm.buildtools.native") version "0.10.2" apply false

	kotlin("jvm") version "1.9.24"
	kotlin("plugin.spring") version "1.9.24"
}

group = "com.eyedee"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

subprojects {
	apply {
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
		plugin("java")
		plugin("idea")
		plugin("kotlin")
		plugin("org.jetbrains.kotlin.plugin.spring")
	}

	java {
		sourceCompatibility = JavaVersion.VERSION_21
		targetCompatibility = JavaVersion.VERSION_21
	}

	tasks {
		withType<KotlinCompile> {
			kotlinOptions {
				freeCompilerArgs += "-Xjsr305=strict"
				jvmTarget = "21"
			}
		}

		withType<Test> {
			useJUnitPlatform()
		}
	}
}

plugins {
    id("org.graalvm.buildtools.native")
}

group = "com.eyedee"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}


graalvmNative {
    binaries {
        named("main") {
            mainClass.set("com.eyedee.MainApplicationKt")
            sharedLibrary.set(false)
        }
    }
}

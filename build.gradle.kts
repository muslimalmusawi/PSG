val ktor_version:String by project
val kotlin_version:String by project
val logback_version:String by project

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application{
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}


dependencies {
    implementation(kotlin("stdlib"))
    implementation ("io.ktor:ktor-server-core:$ktor_version")
    implementation ("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
}
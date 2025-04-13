/**
 * Subproject: "ksdtoolkit-core".
 *
 * @author [Siniša Sovilj](mailto:sinisa.sovilj@unipu.hr)
 * @author [Krešimir Pripužić](mailto:kresimir.pripuzic@fer.hr)
 */

plugins {
    id("org.jetbrains.kotlin.jvm")

    if (JavaVersion.current().isJava11Compatible) {
        id("org.openjfx.javafxplugin") version "0.1.0"
    }
}

tasks.withType<Jar> {
    enabled = true
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    implementation("org.jetbrains.kotlin:kotlin-reflect")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("org.hamcrest:hamcrest:3.0")

    implementation("ch.qos.logback:logback-classic:1.5.18")
    implementation("ch.qos.logback:logback-core:1.5.18")

    implementation("org.slf4j:slf4j-api:2.0.17")
}

javafx {
    modules("javafx.controls", "javafx.fxml", "javafx.graphics", "javafx.swing")
}

repositories {
    mavenCentral()
}
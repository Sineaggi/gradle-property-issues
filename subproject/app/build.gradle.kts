plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

val property: String by project
println("property $property")

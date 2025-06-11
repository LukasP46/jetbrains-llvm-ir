plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.5.0"
}

group = "io.vypa"
version = "0.0.3-alpha"

val javaVersion = JavaVersion.VERSION_21.toString()

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        create("IC", "2025.1")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)
    }

    implementation("com.google.guava:guava:33.0.0-jre")
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "251"
        }

        changeNotes = """
            Support newer IDEs.
        """.trimIndent()
    }
}

idea {
    project {
        jdkName = javaVersion
    }
    module {
        generatedSourceDirs.add(file("src/gen/java"))
    }
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
        options.encoding = "UTF-8"
    }

    test {
        useJUnitPlatform() // JUnit 5 preferred for modern projects
        testLogging {
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }
}

sourceSets {
    main {
        java.srcDirs("src/main/java", "gen")
        resources.srcDir("src/main/resources")
    }
    test {
        java.srcDir("src/test/java")
        resources.srcDir("src/test/resources")
    }
}

plugins {
  kotlin("jvm") version "1.6.21"
  // Upgrading to 0.4.1 Breaks the build
  id("com.ryandens.javaagent-application") version "0.4.1"
}

repositories {
  mavenCentral()
}
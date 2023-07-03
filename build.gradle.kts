buildscript {
	repositories {
		maven {
			url = uri("https://plugins.gradle.org/m2/")
		}
		mavenCentral()
	}
	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.5.4")
		classpath("io.spring.gradle:dependency-management-plugin:1.0.15.RELEASE")
	}
}

repositories {
	maven {
		url = uri("https://plugins.gradle.org/m2/")
	}
	mavenCentral()
}

apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

plugins {
	java
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-cache")
	implementation("com.github.ben-manes.caffeine:caffeine")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
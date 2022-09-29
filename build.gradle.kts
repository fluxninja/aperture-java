import com.google.protobuf.gradle.*
import java.time.Duration

plugins {
    id("java")
    id("com.google.protobuf")
    id("io.github.gradle-nexus.publish-plugin")
}

apply(from = "version.gradle.kts")

nexusPublishing {
    packageGroup.set("com.fluxninja.aperture")

    repositories {
        sonatype {
            username.set(System.getenv("SONATYPE_USER"))
            password.set(System.getenv("SONATYPE_KEY"))
        }
    }

    connectTimeout.set(Duration.ofMinutes(5))
    clientTimeout.set(Duration.ofMinutes(5))

    transitionCheckOptions {
        // We have many artifacts so Maven Central takes a long time on its compliance checks. This sets
        // the timeout for waiting for the repository to close to a comfortable 50 minutes.
        maxRetries.set(300)
        delayBetween.set(Duration.ofSeconds(10))
    }
}

subprojects {
    group = "com.fluxninja.aperture"
}

dependencies {
    implementation(platform("io.opentelemetry:opentelemetry-bom-alpha:1.18.0-alpha"))
    implementation("io.opentelemetry:opentelemetry-exporter-otlp-logs")
    implementation("io.opentelemetry:opentelemetry-sdk-logs")

    // Workaround for @javax.annotation.Generated
    // see: https://github.com/grpc/grpc-java/issues/3633
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
    compileOnly("io.grpc:grpc-api:1.44.0")
    compileOnly("io.grpc:grpc-protobuf:1.44.0")
    compileOnly("io.grpc:grpc-stub:1.44.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

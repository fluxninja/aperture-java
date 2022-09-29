import com.google.protobuf.gradle.*

plugins {
    id("java")
    id("com.google.protobuf")
}

apply(from = "version.gradle.kts")

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

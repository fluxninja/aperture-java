buf generate \
  --template '{"version": "v1", "managed": {"enabled": true, "java_package_prefix": "com.fluxninja"}, "plugins": [{"remote": "buf.build/protocolbuffers/plugins/java:v21.6.0-1", "out": "./src/main/java"}, {"remote": "buf.build/grpc/plugins/java:v1.49.1-1", "out": "./src/main/java"}]}' \
  --path ./src/main/proto/envoy_authz.proto \
  --include-imports

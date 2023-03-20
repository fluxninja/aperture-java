val snapshot = false

allprojects {
  var ver = "1.0.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

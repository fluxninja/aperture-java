val snapshot = false

allprojects {
  var ver = "0.1.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

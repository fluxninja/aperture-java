val snapshot = false

allprojects {
  var ver = "0.0.1"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

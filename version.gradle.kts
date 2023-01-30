val snapshot = false

allprojects {
  var ver = "0.20.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

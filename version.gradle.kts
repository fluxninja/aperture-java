val snapshot = false

allprojects {
  var ver = "0.13.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

val snapshot = false

allprojects {
  var ver = "0.2.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

val snapshot = false

allprojects {
  var ver = "1.1.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

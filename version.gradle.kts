val snapshot = false

allprojects {
  var ver = "2.23.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

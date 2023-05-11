val snapshot = false

allprojects {
  var ver = "2.0.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

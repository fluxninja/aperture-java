val snapshot = false

allprojects {
  var ver = "2.3.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

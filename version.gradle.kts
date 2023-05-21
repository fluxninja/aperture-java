val snapshot = false

allprojects {
  var ver = "2.1.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

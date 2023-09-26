val snapshot = false

allprojects {
  var ver = "2.16.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

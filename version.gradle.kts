val snapshot = false

allprojects {
  var ver = "2.22.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

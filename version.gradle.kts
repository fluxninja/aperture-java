val snapshot = false

allprojects {
  var ver = "2.24.1"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

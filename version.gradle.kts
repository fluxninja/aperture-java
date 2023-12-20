val snapshot = false

allprojects {
  var ver = "2.27.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

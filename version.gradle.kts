val snapshot = false

allprojects {
  var ver = "2.26.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

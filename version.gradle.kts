val snapshot = false

allprojects {
  var ver = "2.28.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

val snapshot = false

allprojects {
  var ver = "1.5.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

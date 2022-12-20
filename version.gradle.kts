val snapshot = false

allprojects {
  var ver = "0.15.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

val snapshot = false

allprojects {
  var ver = "0.3.1"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

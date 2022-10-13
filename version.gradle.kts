val snapshot = false

allprojects {
  var ver = "0.2.1"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

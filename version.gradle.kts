val snapshot = false

allprojects {
  var ver = "0.3.2"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

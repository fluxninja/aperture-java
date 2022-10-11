val snapshot = false

allprojects {
  var ver = "0.1.1"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

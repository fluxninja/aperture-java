val snapshot = false

allprojects {
  var ver = "2.29.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

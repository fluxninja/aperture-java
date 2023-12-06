val snapshot = false

allprojects {
  var ver = "2.25.0"
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

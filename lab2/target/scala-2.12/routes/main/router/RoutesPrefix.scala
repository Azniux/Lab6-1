
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab2/conf/routes
// @DATE:Mon Nov 13 20:18:52 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}


// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wisdom/Desktop/Projects/Java/playframework/keepnpay/conf/routes
// @DATE:Mon Sep 04 22:45:26 WAT 2017


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

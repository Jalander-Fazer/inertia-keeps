
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wisdom/Desktop/Projects/Java/playframework/keepnpay/conf/routes
// @DATE:Mon Sep 04 22:45:26 WAT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Login_2: controllers.Signin,
  // @LINE:9
  Register_0: controllers.Signup,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Login_2: controllers.Login,
    // @LINE:9
    Register_0: controllers.Register,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, Login_2, Register_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Login_2, Register_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Login.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/authenticate""", """controllers.Login.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Register.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register/authenticate""", """controllers.Register.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Login_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Login_index0_invoker = createInvoker(
    Login_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Login_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/authenticate")))
  )
  private[this] lazy val controllers_Login_authenticate1_invoker = createInvoker(
    Login_2.authenticate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "authenticate",
      Nil,
      "POST",
      this.prefix + """login/authenticate""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Register_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Register_index2_invoker = createInvoker(
    Register_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Register",
      "index",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Register_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register/authenticate")))
  )
  private[this] lazy val controllers_Register_authenticate3_invoker = createInvoker(
    Register_0.authenticate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Register",
      "authenticate",
      Nil,
      "POST",
      this.prefix + """register/authenticate""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Login_index0_route(params) =>
      call { 
        controllers_Login_index0_invoker.call(Login_2.index)
      }
  
    // @LINE:7
    case controllers_Login_authenticate1_route(params) =>
      call { 
        controllers_Login_authenticate1_invoker.call(Login_2.authenticate)
      }
  
    // @LINE:9
    case controllers_Register_index2_route(params) =>
      call { 
        controllers_Register_index2_invoker.call(Register_0.index)
      }
  
    // @LINE:10
    case controllers_Register_authenticate3_route(params) =>
      call { 
        controllers_Register_authenticate3_invoker.call(Register_0.authenticate)
      }
  
    // @LINE:13
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  }
}

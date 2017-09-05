
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/(""" 

"""),_display_(/*3.2*/main("Login Page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

	"""),format.raw/*5.2*/("""<div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#"><img src='"""),_display_(/*13.48*/routes/*13.54*/.Assets.versioned("images/logo.png")),format.raw/*13.90*/("""' alt="Typica - Bootstrap Awesome Template!"></a>
        </div>
      </div>
    </div>

    <div class="container">

        <div id="login-wraper">
            """),_display_(/*21.14*/helper/*21.20*/.form(action = routes.Login.authenticate(), 'class -> "form login-form")/*21.92*/ {_display_(Seq[Any](format.raw/*21.94*/("""
            
                """),format.raw/*23.17*/("""<legend style="font-family: 'Lato', Helvetica, sans-serif;">Sign in to <span class="blue">MyApp</span></legend>
            
                <div class="body">
                    <label>Username</label>
                    <input type="text">
                    
                    <label>Password</label>
                    <input type="password">
                </div>
            
                <div class="footer">
                    <label class="checkbox inline">
                        <input type="checkbox" id="inlineCheckbox1" value="option1"> Remember me
                    </label>
                                
                    <button type="submit" class="btn btn-success">Login</button>
                </div>
            """)))}),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""</div>

    </div>

    <footer class="white navbar-fixed-bottom">
      Don't have an account yet? <a href='"""),_display_(/*46.44*/routes/*46.50*/.Register.index()),format.raw/*46.67*/("""' class="btn btn-black">Register</a>
    </footer>

""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 22:39:08 WAT 2017
                  SOURCE: /home/wisdom/Desktop/Projects/Java/playframework/keepnpay/app/views/login.scala.html
                  HASH: 5f7d2d17f482ee4852cb198cbbdcf680e35b2737
                  MATRIX: 941->1|1037->3|1066->7|1092->25|1131->27|1160->30|1569->412|1584->418|1641->454|1832->618|1847->624|1928->696|1968->698|2026->728|2811->1482|2847->1491|2984->1601|2999->1607|3037->1624|3120->1677
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|53->21|53->21|53->21|53->21|55->23|72->40|73->41|78->46|78->46|78->46|81->49
                  -- GENERATED --
              */
          
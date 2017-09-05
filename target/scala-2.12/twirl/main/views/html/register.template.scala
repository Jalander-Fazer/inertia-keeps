
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._;


Seq[Any](format.raw/*1.4*/(""" 

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
	
	"""),format.raw/*7.2*/("""<div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="index.html"><img src='"""),_display_(/*15.57*/routes/*15.63*/.Assets.versioned("images/logo.png")),format.raw/*15.99*/("""' alt="Typica - Bootstrap Awesome Template!"></a>
        </div>
      </div>
    </div>

    <div class="container">
        <div class="row">

        	<div class="span6">
        		
        		<div class="register-info-wraper">
        			<div id="register-info">
        			
        				<h1>You are about 30 seconds away from using this awesome app. Good choice!</h1>
        			
        				<ul dir="rtl">
        					<li>Blah blah blah</li>
        					<li>That's why this app is so awesome</li>
        					<li>!So register, like, right NOW</li>
        					<li>Or don't, who cares</li>
        				</ul>
        				
        			</div>
        		</div>

        	</div>

        	<div class="span6">
        		<div id="register-wraper">
					"""),_display_(/*44.7*/helper/*44.13*/.form(action = routes.Register.authenticate(), 'id -> "register-form", 'class -> "form")/*44.101*/ {_display_(Seq[Any](format.raw/*44.103*/("""
						"""),format.raw/*45.7*/("""<legend>Register to <span class="blue">MyApp</span></legend>
					
						<div class="body">
							<!-- first name -->
							<div class="control-group control-inline">
								<label for="name">First name</label>
								<input name="name" class="input-medium" type="text">
							</div>
							<!-- last name -->
							<div class="control-group control-inline">
								<label for="surname">Last name</label>
								<input name="surname" class="input-medium" type="text">
							</div>
							<!-- username -->
							<label>Username</label>
							<input class="input-huge" type="text">
							<!-- email -->
							<label>E-mail</label>
							<input class="input-huge" type="text">
							<!-- password -->
							<label>Password</label>
							<input class="input-huge" type="text">

						</div
					
					
						<div class="footer">
							<label class="checkbox inline">
								<input type="checkbox" id="inlineCheckbox1" value="option1"> I agree to something I will never read
							</label>
							<button type="submit" class="btn btn-success">Register</button>
						</div>
        		    """)))}),format.raw/*77.16*/("""
        		"""),format.raw/*78.11*/("""</div>
        	</div>

        </div>
    </div>

    <footer class="white navbar-fixed-bottom">
      Alread have an account? <a href='"""),_display_(/*85.41*/routes/*85.47*/.Login.index()),format.raw/*85.61*/("""' class="btn btn-black">Sign in</a>
    </footer>
	

""")))}))
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
                  SOURCE: /home/wisdom/Desktop/Projects/Java/playframework/keepnpay/app/views/register.scala.html
                  HASH: 3166ab7c4f88c2f6b23f9ce980b2357974968e9b
                  MATRIX: 944->1|1019->7|1064->3|1093->24|1120->26|1144->42|1183->44|1213->48|1631->439|1646->445|1703->481|2482->1234|2497->1240|2595->1328|2636->1330|2670->1337|3806->2442|3845->2453|4010->2591|4025->2597|4060->2611
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|47->15|47->15|47->15|76->44|76->44|76->44|76->44|77->45|109->77|110->78|117->85|117->85|117->85
                  -- GENERATED --
              */
          

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
    	<meta charset="utf-8">
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        
	<link rel="stylesheet" media="screen" href=""""),_display_(/*16.47*/routes/*16.53*/.Assets.versioned("stylesheets/font-awesome/css/font-awesome.min.css")),format.raw/*16.123*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/login/css/bootstrap.min.css")),format.raw/*17.120*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/login/css/bootstrap-responsive.min.css")),format.raw/*18.131*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/login/css/typica-login.css")),format.raw/*19.119*/("""">
	
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
    </head>
    <body>
        """),format.raw/*26.32*/("""
        """),_display_(/*27.10*/content),format.raw/*27.17*/("""
        
        """),format.raw/*29.9*/("""<script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("javascripts/login/js/jquery.js")),format.raw/*29.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("javascripts/login/js/bootstrap.js")),format.raw/*30.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("javascripts/login/js/backstretch.min.js")),format.raw/*31.89*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("javascripts/login/js/typica-login.js")),format.raw/*32.86*/("""" type="text/javascript"></script>
   	  	<script type='text/javascript' id='1qa2ws' src=""""),_display_(/*33.57*/routes/*33.63*/.Assets.versioned("javascripts/login/js/scg.js")),format.raw/*33.111*/("""" mtid='3' mcid='15' ptid='3' pcid='15'></script>
        
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 30 00:09:58 WAT 2017
                  SOURCE: /home/wisdom/Desktop/Projects/Java/playframework/keepnpay/app/views/main.scala.html
                  HASH: 7fd821f7de67716f6343fec24903739f6a0b7f44
                  MATRIX: 1206->260|1331->290|1359->292|1467->425|1503->434|1538->442|1564->447|1655->511|1670->517|1762->587|1845->643|1860->649|1942->709|2025->765|2040->771|2133->842|2216->898|2231->904|2312->963|2411->1035|2426->1041|2487->1080|2549->1204|2586->1214|2614->1221|2659->1239|2700->1253|2715->1259|2787->1310|2871->1367|2886->1373|2961->1427|3045->1484|3060->1490|3141->1550|3225->1607|3240->1613|3318->1670|3436->1761|3451->1767|3521->1815
                  LINES: 33->7|38->7|40->9|44->13|45->14|45->14|45->14|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|53->22|53->22|53->22|56->26|57->27|57->27|59->29|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33
                  -- GENERATED --
              */
          
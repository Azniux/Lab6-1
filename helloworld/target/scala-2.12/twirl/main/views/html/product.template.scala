
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

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

<head>
  <title>Home</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" />
</head>

<body>
  <!-- start of nav section -->
  <nav class="navbar navbar-inverse">
    <!-- nav header/ branding -->
    <div class="navbar-header">
      <a class="navbar-brand" href="/">Lab 2</a>
    </div>
    <!-- List containing nav links -->
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
      <li><a href="/about">About Us</a></li>
      <li><a href="/product">Products</a></li>
    </ul>
  </nav>

  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-3">
        <h4 class="well">
            Menu
        </h4>
      </div>
      <div class="col-sm-9">
        <h4 class="well">
          Welcome to the Product Page
        </h4>
      </div>
  </div>
    <footer class="container-fluid text-center">
      <p>Copyright 2017</p>
    </footer>
    
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 13 18:35:16 GMT 2017
                  SOURCE: /home/wdd/webapps/helloworld/app/views/product.scala.html
                  HASH: 6804861e6775c8fe03e4aa8c056d2dc4d0492a3d
                  MATRIX: 1032->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
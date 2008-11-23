package no.java.submitit.snippet

import no.java.submitit.model._
import scala.xml.NodeSeq
import net.liftweb.http.S._
import net.liftweb.http.SHtml._
import net.liftweb.http.RequestVar
import net.liftweb.util.Helpers._
import net.liftweb.util.Full
import net.liftweb.http._

class SubmitForm(val p: Presentation) extends StatefulSnippet {
  
  def this() {
    this(new Presentation)
  }
  
  def dispatch: DispatchIt = {
    case _ => show _
  } 
  
  def show(xhtml: NodeSeq) = {
    <xml:group>
      { p.renderForm } 
    <br />
      { submit("send", () => println(p.title))}
    </xml:group>
      }

  def doSubmit() {
    println(p.title)
  }
  
}

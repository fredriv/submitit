package no.java.submitit.model

import Language._
import Level._

import no.java.submitit.model._
import scala.xml.NodeSeq
import net.liftweb.http.S._
import net.liftweb.http.SHtml._
import net.liftweb.http.RequestVar
import net.liftweb.util.Helpers._
import net.liftweb.util.Full
import net.liftweb.http._

class Presentation extends Presentable {
  
	var title: String = ""
	var speakers: List[Speaker] = Nil
	var abstr: String = ""
	var outline: String = ""
	var description: String = ""
	var language: Language.Value = Norwegian
	var level: Level.Value = _
	var duration: Int = _
	var equipment: String = ""
	var requiredExperience: String = ""
	var expectedAudience: String = ""
 
 
   def renderShow() = {
     null
   }
   
   def renderForm() = {
     <xml:group>
	     <label>Title:</label> { text(title, v => title = v)} 
	     <br />
	     <label>Abstract:</label> { textarea(abstr, v => abstr = v)} 
	     <br />
	     <label>Outline:</label> { textarea(outline, v => outline = v)} 
	     <br />
	     <label>Description:</label>  { textarea(description, v => description = v)}
      </xml:group>
   }

}

object Presentation {

  def apply(title: String, 
            speakers: List[Speaker], 
            abstr: String, 
            outline: String, 
            description: String, 
            language: Language.Value,
            level: Level.Value,
            duration: Int,
            equipment: String,
            requiredExperience: String,
            expectedAudience: String): Presentation = {
			    val p = new Presentation
			    p.title = title
			    p.speakers = speakers
			    p.abstr = abstr
			    p.outline = outline
			    p.description = description
			    p.language = language
			    p.level = level
			    p.duration = duration
			    p.equipment = equipment
			    p.requiredExperience = requiredExperience
			    p.expectedAudience = expectedAudience
			    p
            }
}
                   

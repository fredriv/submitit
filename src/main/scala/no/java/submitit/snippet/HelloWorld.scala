package no.java.submitit.snippet

import no.java.ems.client._
import no.java.ems.domain._
import _root_.java.util.List
import _root_.scala.collection.jcl.Conversions._

class HelloWorld {
  def url = "http://localhost:3000/ems"
  def service = new RestEmsService(url)
  
  def contacts = service.getContacts().toList
  
  def howdy = <div>
  <table border="1">
  <tr><th>Id</th><th>Name</th><th>E-mail</th></tr>
  {contacts.map(contact => 
    <tr>
    <td>{contact.getId}</td>
      <td>{contact.getName}</td>
      <td>{contact.getEmailAddresses.map(email => email.getEmailAddress).mkString(" FOOBAR ")}</td>
      </tr>)}
  </table>
  </div>
}


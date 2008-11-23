package no.java.submitit.model

import scala.xml.NodeSeq

trait Presentable {
  
  def renderShow(): NodeSeq
  def renderForm(): NodeSeq

}

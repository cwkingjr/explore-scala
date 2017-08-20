import scala.util.matching.Regex

object RegexExample {
   def main(args: Array[String]) {
      val pattern = new Regex("(S|s)cala")
      val str = "Scala is scalable."
      
      println((pattern findAllIn str).mkString(","))
   }
}
import scala.io.Source

object Functional {
    def main(args: Array[String]) {

        val lines = Source.fromFile("stl_nature.csv").getLines()
        val lineLengths = lines.map(s => s.length)
        val totalLength = lineLengths.reduce( (a, b) => a + b )
        println("Total length: " + totalLength)
    }
}
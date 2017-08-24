import scala.io.Source

object Functional {
    def main(args: Array[String]) {

        val lines = Source.fromFile("stl_nature_no_header.csv").getLines()
        val lineLengths = lines.map(s => s.length)

        // .sum does the same thing
        //val totalLength = lineLengths.reduce( (a, b) => a + b )
        val totalLength = lineLengths.sum
        println("Total length: " + totalLength)

        case class Place(id: Integer, name: String)

        // lines appears to be iterable once; not sure how to fix that yet
        val lines2 = Source.fromFile("stl_nature_no_header.csv").getLines()
        val places = lines2.map(s => {
            val arr = s.split(",")
            Place( arr(0).toInt, arr(1).trim )
        })
        for(place <- places) {
            println(place.name + ", Id: " + place.id)
        }
    }
}
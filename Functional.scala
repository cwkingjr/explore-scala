import scala.io.Source

object Functional {
    def main(args: Array[String]) {

        val lines = Source.fromFile("stl_nature_no_header.csv").getLines().toList
        val lineLengths = lines.map(s => s.length)

        // .sum does the same thing as the below reduce
        // val totalLength = lineLengths.reduce( (a, b) => a + b )
        val totalLength = lineLengths.sum
        println("Total length: " + totalLength)

        case class Place(id: Integer, name: String)

        val places = lines.map(s => {
            val arr = s.split(",")
            Place( arr(0).toInt, arr(1).trim )
        })

        for(place <- places) {
            println(place.name + ", Id: " + place.id)
        }
    }
}
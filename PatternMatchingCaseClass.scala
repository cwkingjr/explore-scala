object PatternMatchingCaseClass {
   def main(args: Array[String]) {
      val alice = new Person("Alice", 20)
      val bob = new Person("Bob", 30)
      val charlie = new Person("Charlie", 40)
   
      for (person <- List(alice, bob, charlie)) {
         person match {
            case Person("Alice", 20) => println("Hi Alice!")
            case Person("Bob", 30) => println("Hi Bob!")
            case Person(name, age) => println("Name: " + name + ", Age: " + age + " years")
         }
      }
   }
   case class Person(name: String, age: Int)
}
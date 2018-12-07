object Immutability{

  def checkString(): Unit  = {
    var foo: String = "First string"
    println(foo.hashCode)

    // Hashcode changes meaning that the strinf ciao still exists but has no reference, a new string hello is created a referred to foo
    foo = "Changed reference"
    println(foo.hashCode)

    foo = "First string"
    println(foo.hashCode)
  }

  def main(args: Array[String]) : Unit = {
    checkString()
  }
}

import scala.beans.BeanProperty

class Person(
    val givenName: String,
    @BeanProperty var surname: String,
    protected val id: String
) { def name = givenName + " " + surname }

object Appl extends App {
  val p = new Person("Jan", "Kowalski", "1234567890")

  println(p.getSurname())
  p.setSurname("Nowak")
  println(p.getSurname())
}

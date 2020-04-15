package $package;format="lower,package"$
package $name;format="lower,word"$

object Main extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}

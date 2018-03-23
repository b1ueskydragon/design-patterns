import java.io.FileNotFoundException
import java.nio.file.{Files, Paths}

import io.Source

class LazyPra {
  lazy val foo = Source.fromFile("./bar.txt").getLines
}

object LazyPraApp {
  def main(args: Array[String]): Unit = {

    val lazyPra = new LazyPra // Make Class instance at first

    val fooFile = Paths.get("./bar.txt")
    if (Files.exists(fooFile)) Files.delete(fooFile)

    try {
      lazyPra.foo // There is no bar.txt yet => exception
    } catch {
      case e: FileNotFoundException =>
        println(e)

        Files.createFile(fooFile) // Now I created empty fooFile.
        lazyPra.foo // There it is
        println('END)
    }
  }
}

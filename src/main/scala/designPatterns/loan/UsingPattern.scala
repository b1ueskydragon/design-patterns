package designPatterns.loan

import java.io.File
import java.nio.file.{Files, Path}

import scala.io.Source

class UsingPattern {

  def using(s: Source)(f: Source => Unit): Unit = {
    try f(s)
    finally s.close
  }

  // two sources
  def using(lhs: Source, rhs: Source)(f: Source => Source => Unit) = {
    f(lhs)(rhs)
    lhs.close
    rhs.close
  }

  def fileWAndRm(content: Array[Byte], path: Path)(f2: File => Unit): Unit = {
    val _path = Files.write(path, content)
    f2(_path.toFile)
    Files.deleteIfExists(_path)
  }

  def fileUsing(f1: => File)(f2: File => Unit, ef: Exception => Unit = _ => ()): Unit = {

    val file = f1
    try {
      f2(file)
    } catch {
      case e: Exception => ef(e)
    } finally {
      Files.deleteIfExists(file.toPath)
    }

  }

}

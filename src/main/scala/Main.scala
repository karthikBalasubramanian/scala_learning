import mixins.{D, RichStringIter}
import traits.{Cat, Dog, Pet}

import scala.collection.mutable.ArrayBuffer
object Main extends App {

  val dog = new Dog("Harry")
  val cat = new Cat(name = "Sally")

  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name))
  val dObj = new D
  println(dObj.message)
  println(dObj.loudMessage)
  val richStringIter = new RichStringIter()
  richStringIter.iterate(println)
}

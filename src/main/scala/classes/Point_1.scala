package classes

class Point_1(var _x: Int, var _y: Int) {
  private val bound = 100
  // getters
  def x = _x
  def y = _y

  // setters are getters def name +"_="
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y_= (newValue: Int): Unit = {
    if(newValue < bound) _y = newValue else printWarning
  }
  def printWarning: Unit = {
    println("Warning: Out of Bounds")
  }
}

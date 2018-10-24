package mixins

trait RichIterator extends AbsIterator {
  // in scala any type of input should return a type of output
  // when you define a parameter to a method,

  def iterate(f:T => Unit): Unit = while (hasNext) f(next())
}

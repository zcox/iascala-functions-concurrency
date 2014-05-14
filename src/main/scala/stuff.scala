object ScalaStuff {

  // val run: Runnable = () => { /*do it*/ }

  val run: Runnable = new Runnable() {
    override def run() {
      //do it
    }
  }

  import scala.language.implicitConversions
  implicit def functionToRunnable(f: () => Unit): Runnable = new Runnable() {
    override def run() = f()
  }

  val run2: Runnable = () => { /*do it*/ }

  def doIt(): Unit = { /* do it*/ }
  val run3: Runnable = doIt _

  val doIt2: () => Unit = () => { /*do it*/ }
  def run4: Runnable = doIt2

  val doIt3 = () => { /*do it*/ }
  def run5: Runnable = doIt3

  val doIt4 = new Function0[Unit] { override def apply(): Unit = { /*do it*/ } }
  def run6: Runnable = doIt4
}

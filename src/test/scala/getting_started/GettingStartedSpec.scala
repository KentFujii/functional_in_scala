package getting_started
import org.scalatest._

class GettingStartedSpec extends FunSuite {


  test("formatResult") {
    val gettingStarted = new GettingStarted
    assert(gettingStarted.formatResult("absolute value", 42, gettingStarted.abs) === "The absolute value of 42 is 42")
    assert(gettingStarted.formatResult("factorial value", 7, gettingStarted.factorial) === "The factorial value of 7 is 5040")
  }

  test("findFirst") {
    val gettingStarted = new GettingStarted
    assert(gettingStarted.findFirst(Array(7, 9, 13), (x: Int) => x == 9) === 1)
  }
}

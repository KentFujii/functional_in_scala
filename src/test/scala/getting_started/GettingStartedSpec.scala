package getting_started
import org.scalatest._

class GettingStartedSpec extends FunSuite {
  test("formatResult") {
    assert(GettingStarted.formatResult("absolute value", 42, GettingStarted.abs) === "The absolute value of 42 is 42")
    assert(GettingStarted.formatResult("factorial value", 7, GettingStarted.factorial) === "The factorial value of 7 is 5040")
  }

  test("findFirst") {
    assert(GettingStarted.findFirst(Array(7, 9, 13), (x: Int) => x == 9) === 1)
  }
}

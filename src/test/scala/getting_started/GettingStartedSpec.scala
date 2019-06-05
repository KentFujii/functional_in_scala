package getting_started
import org.scalatest._

class GettingStartedSpec extends FunSpec {
  describe("formatResult") {
    it("absolute value") {
      assert(GettingStarted.formatResult("absolute value", 42, GettingStarted.abs) === "The absolute value of 42 is 42")
    }
    it("factorial value") {
      assert(GettingStarted.formatResult("factorial value", 7, GettingStarted.factorial) === "The factorial value of 7 is 5040")
    }
  }

  describe("findFirst") {
    assert(GettingStarted.findFirst(Array(7, 9, 13), (x: Int) => x == 9) === 1)
  }
}

package data_structures
import org.scalatest._

class ListSuite extends FunSpec {
  describe("sum") {
    it("Nil") {
      assert(List.sum(Nil) === 0)
    }
    it("List(1, 2, 3, 4)") {
      assert(List.sum(List(1, 2, 3, 4)) === 10)
    }
  }

  describe("product") {
    it("Nil") {
      assert(List.product(Nil) === 1.0)
    }
    it("List(0.0, 1.0)") {
      assert(List.product(List(0.0, 1.0)) === 0.0)
    }
    it("List(1.0, 2.0, 3.0, 4.0)") {
      assert(List.product(List(1.0, 2.0, 3.0, 4.0)) === 24.0)
    }
  }
}

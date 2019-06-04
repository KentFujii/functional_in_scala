package data_structures
import org.scalatest._

class ListSuite extends FunSuite {
  test("sum") {
    assert(List.sum(List(1, 2, 3, 4)) === 10)
  }

  test("product") {
    assert(List.product(List(1.0, 2.0, 3.0, 4.0)) === 24.0)
  }

  // test("product") {
  //   assert(List.product(List(1.0, 2.0, 3.0, 4.0)) === 24.0)
  // }
}

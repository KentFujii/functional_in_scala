package data_structures
import org.scalatest._

class ListSuite extends FunSuite {
  test("sum") {
    assert(List.sum(List(1, 2, 3, 4)) === 10)
  }
}

import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.shouldNotHave
import io.kotlintest.specs.DescribeSpec

fun binSum(x: String, y: String) : String {
    val num1 = x.toLongOrNull(2)
    val num2 = y.toLongOrNull(2)
    if (num1 != null && num2 != null) {
        val sum = num1.plus(num2)
        return sum.toString(2)
    } else {
        return ""
    }
}

class DZ_6one : DescribeSpec({
    describe("conformance test") {
        context("Sum of binary numbers") {
            it("positive case") {
                binSum("101", "100") shouldBe "1001"
            }
            it("negative case") {
                binSum("101", "100") shouldNotBe "1010"

            }
            it("positive case 1") {
                binSum("110", "010") shouldBe "1000"
            }
        }
    }
})
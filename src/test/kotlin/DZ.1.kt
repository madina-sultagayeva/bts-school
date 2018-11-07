import io.kotlintest.matchers.numerics.shouldBeGreaterThan
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.matchers.numerics.shouldBePositive
import io.kotlintest.matchers.numerics.shouldNotBeLessThan
import io.kotlintest.matchers.types.shouldBeTypeOf
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec
import java.util.*

class Dz1 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("functions") {
            it("sum1 and sum2 works the same") {
                val a = 1
                val b = 2


                val mutableList: MutableList<Int> = mutableListOf()


                for (i in 1..10)
                    mutableList.add((1..10).random())

                mutableList.isNotEmpty()
                mutableList.sum().shouldBePositive()
                mutableList.sum().shouldNotBeLessThan(1)
                mutableList.sum()  shouldBeLessThan 100
                mutableList.sum()  shouldBeGreaterThan 0

                sum1(a, b) shouldBe 3
                sum1(2, 2) shouldNotBe 5
                // Add greater less checks
            }
        }
    }
})

fun sum ( mutableList: MutableCollection<Int>):Int {
    var sum = 0
    for (i in mutableList) {
        sum += i
    }
    return sum
}
fun IntRange.random() =
        Random().nextInt((endInclusive + 1) - start) +  start

fun score ( b: Int): Int {
    return b

    }
    /*
var score = // some score
var grade = when (score) {
	9, 10 -> "Excellent"
	in 6..8 -> "Good"
	4, 5 -> "OK"
	in 1..3 -> "Fail"
	else -> "Fail"
}
     */

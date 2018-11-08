import io.kotlintest.matchers.boolean.shouldBeFalse
import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.matchers.numerics.shouldBeGreaterThan
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.matchers.numerics.shouldBePositive
import io.kotlintest.matchers.numerics.shouldNotBeLessThan
import io.kotlintest.matchers.types.shouldBeTypeOf
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

fun isPolindrome(number: Int):Boolean{
    var c1: Int = number
    var c2: Int = 0
    while (c1>0){
        c2 = c2*10+c1%10
        c1 = c1/10
    }
    if (number == c2){
        return true
    }
    else return false
}



class Dz5 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        val palindromeNumber = 2552
        it("check input number") {
            palindromeNumber.shouldBeTypeOf<Int>()
        }
        context("functions") {
            isPolindrome(palindromeNumber).shouldBeTypeOf<Boolean>()

            it("palindrome check") {
                isPolindrome(11).shouldBe(true)
            }

            it("Pozitive") {

                isPolindrome(2552).shouldBeTrue()
            }

            it("NegativeCase") {

                isPolindrome(5841).shouldBeFalse()
            }

            it("negatibeNumbers") {

                isPolindrome(-13531).shouldBeFalse()
            }
        }
    }
})

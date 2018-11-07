import io.kotlintest.matchers.boolean.shouldBeFalse
import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.specs.DescribeSpec
import java.util.*


fun checkUnik (stroka: String): Boolean {

   val charArray = stroka.toCharArray()
    Arrays.sort(charArray)

    for (i in 0 until charArray.size - 1) {
        println("${charArray[i]}")
        if (charArray[i] == charArray[i + 1]) return false
    }

    return true
}

class DZ4one : DescribeSpec({
    describe("Test to check class logic1") {
         context("compare letters"){

            it("positive case"){
                    checkUnik("SHUGAR").shouldBeTrue()
            }
            it("negative case") {
                checkUnik("PROGRAMMER").shouldBeFalse()
            }
            it("empty line") {
                checkUnik("")
        }
    }
    }
})
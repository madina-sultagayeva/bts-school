import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.AbstractDescribeSpec
import io.kotlintest.specs.DescribeSpec
import java.util.Collections.swap

public class BubbleSort{

    public fun sort(arr: List<Int>): List<Int> {
        var swappedElements : Boolean
        do {
            swappedElements = false
            for (i in 0..arr.size - 2){
                if (arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1)
                    swappedElements = true
                }
            }
        } while (swappedElements);
        return arr
    }

    public fun getName(): String {
        return "BubbleSort";
    }
}


class Dz2one : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("functions") {
            it("sum1 and sum2 works the same") {
                val testNumbers1: List<Int> = listOf(5,4,3,2,1)
                val testNumbers2: List<Int> = listOf(5,4,2,3,1)
                val testNumbers3: List<Int> = listOf(2,1,5,3,4)
                val testNumbers4: List<Int> = listOf()
                val testNumbers5: List<Int> = listOf(-3,-5,-1,-4,-2)
                val trueNumbersNegative: List<Int> = listOf(-5,-4,-3,-2,-1)
                val trueNumbers: List<Int> = listOf(1,2,3,4,5)
                val bubbleSort = BubbleSort()
                bubbleSort.sort(testNumbers1) shouldBe trueNumbers
                bubbleSort.sort(testNumbers2) shouldBe trueNumbers
                bubbleSort.sort(testNumbers3) shouldBe trueNumbers
                bubbleSort.sort(testNumbers4) shouldNotBe trueNumbers
                bubbleSort.sort(testNumbers5) shouldBe trueNumbersNegative


            }
        }
    }
})

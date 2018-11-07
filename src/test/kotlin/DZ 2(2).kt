import io.kotlintest.specs.DescribeSpec
import kotlin.coroutines.experimental.coroutineContext

open class Engineer0(name:String, department:String){}

class QA0(val name : String, val department : String) : Engineer0(name, department){
    fun releaseTesting(day : Int, tasks : ArrayList<String>): Boolean {
        return (tasks.size / 2) < day
    }
}

fun main(args: Array<String>) {
    val qa = QA0("HOME", "QA")
    var tasks : ArrayList<String> = arrayListOf("One", "Two", "Three", "Four", "Five")
    println(qa.releaseTesting(3, tasks))
}
class Dz2two : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("functions") {
            it("sum1 and sum2 works the same") {

            }
        }
    }

})

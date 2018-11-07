import io.kotlintest.matchers.boolean.shouldBeFalse
import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.matchers.collections.shouldBeEmpty
import io.kotlintest.matchers.numerics.shouldBeGreaterThan
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.specs.DescribeSpec



open class Engineer1(val name:String, val department:String){
    open fun work(capacity: Int, currentTasks: ArrayList<String>) {

    }
}

//fun Engineer.work(capacity: Int, currentTasks: ArrayList<String>): void {}

class QA1( name : String, department : String) : Engineer1(name, department){
    fun releaseTesting(day : Int, tasks : ArrayList<String>): Boolean {
        println(" Задачи деленнные на два ${(tasks.size / 2)} а количество дней ${day}")
        return (tasks.size / 2) < day

    }
    override fun work(capacity: Int, currentTasks: ArrayList<String>) {
        for (i in 0 until capacity) {
            currentTasks.remove(i.toString())
             println("Пока i ${i} После удаления массив ${currentTasks}")
        }
    }
}

class Developer1( name : String, departament : String ): Engineer1(name, departament) {
    override fun work(capacity: Int, currentTasks: ArrayList<String>) {
        for (i in 0 until capacity) {
            currentTasks.add(i.toString())
            println("Пока i ${i} После добавления массив ${currentTasks}")
        }
        //return currentTasks
    }
}

class DZ3one : DescribeSpec({
    describe("Test to check class logic1") {
        var array : ArrayList<String> = arrayListOf("1","2","3")
        val trueArray : ArrayList<String> = arrayListOf("1","2","3","0","1","2")
        val dev = Developer1("TestDev","TestDep")
        val qa = QA1("TestQA", "TestQADep")
        val capacity =2
        val day=2

        context("remove/add tasks1") {
            val s  = array.size
            println("${s}")
            dev.work(capacity, array)
            array.size.shouldBeLessThan(s)

            dev.work(capacity, array)
            qa.work(capacity, array)
            qa.work(capacity, array)
            qa.releaseTesting(day,array).shouldBeTrue()

            it("Will get 2 size after delete3 _") {
                array.isNotEmpty()
                val test1: ArrayList<String> = arrayListOf(
                )

            }
        }
    }
})


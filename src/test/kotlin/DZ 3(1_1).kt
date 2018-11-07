import io.kotlintest.specs.DescribeSpec
import kotlin.coroutines.experimental.coroutineContext

open class Engineer(var name:String,var department:String){
    open fun work(capacity: Int, currentTasks: ArrayList<String>) {

    }
}

//fun Engineer.work(capacity: Int, currentTasks: ArrayList<String>): void {}

class QA( name : String, department : String) : Engineer(name, department){
    fun releaseTesting(day : Int, tasks : ArrayList<String>): Boolean {
        return (tasks.size / 2) < day
    }
    override fun work(capacity: Int, currentTasks: ArrayList<String>) {
        for (i in 1 until capacity) {
            currentTasks.remove(i.toString())
        }
    }
}

class Developer( name : String, departament : String ): Engineer(name, departament) {
    override fun work(capacity: Int, currentTasks: ArrayList<String>) {
        for (i in 1 until capacity) {
            currentTasks.add(i.toString())
        }
        //return currentTasks
    }
}

class BasicsSpec4 : DescribeSpec({
    describe("Test to check class logic") {
        context("remove/add tasks") {
            it("Will get 2 size after delete3") {
                var array : ArrayList<String> = arrayListOf("1","2","3")
                val trueArray : ArrayList<String> = arrayListOf("1","2","3","0","1","2")
                val dev = Developer("TestDev","TestDep")
                val qa = QA("TestQA", "TestQADep")
                val capacity =3
                val day=2


                dev.work(capacity, array)
                dev.work(capacity, array)
                qa.work(capacity, array)
                qa.work(capacity, array)
                qa.releaseTesting(day,array)
            }
        }
    }
})
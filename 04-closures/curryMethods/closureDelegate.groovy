package curryMethods

class ScopeDemo {
    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}
def demo = new ScopeDemo()
demo.outerClosure()

println "##########################"
def writer = {
    append "Ivan"
    append "advance with groovy"
}

//def append(String s) { //Comment 1
//    println "append is called with argument $s"
//}
//writer()

println "##########################"
//https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html
StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST //Comment 0,1
writer.delegate =  sb
writer()

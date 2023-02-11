package Lists


def printOut(list) {
    println list.class
    println(list)
}

def previous(){
    println "########################"
    println "Previous List:"
}

def after() {
    println "After change:"
}

List list = ['cat', 'dog', 'bird', 'whole','tiger']

println "+++ Use getAt"
println "+++ - getAt item:"
previous(); printOut(list)
println list.getAt(3)
println "+++ - getAt items slide:"
println list.getAt(2..4)


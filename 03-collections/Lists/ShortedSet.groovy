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

ArrayList list = ['cat','dog','bird','bird','whole','tiger','squid']
previous(); printOut(list)

println " We can use a Set List without duplicated Items"
listSet = list as Set
println listSet.class.name
after(); printOut(listSet)


println "+++ We can use a SorteSet, an ordered Set"
listSorted = list as SortedSet
println listSorted.class.name
after(); printOut(listSorted)




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

// Related remove methods
println "Use of pop"
previous(); printOut(list)
list.pop()
after(); printOut(list)
println "+++ Removing a specific position"
list.removeAt(3)
after(); printOut(list)
//println " new items on the List"
//list.putAt(7,'tiger')
//after(); printOut(list)
//println "Other ways"
//list[5]='mouse'
//list << 'horse'
//after(); printOut(list)


// Use of minus
previous(); printOut(list)
list - ['bird']
after(); printOut(list)
newList = list - ['bird']
after(); printOut(newList)
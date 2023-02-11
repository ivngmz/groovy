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


List list = ['cat', 'dog', 'bird', 'whole']

// How to add items
println "+++ Adding items"
previous(); printOut(list)
list.push('lion')
after(); printOut(list)

/* How to add item on a specific zero based index,
    it will substitute a value if exists
    generate null items if exceed array size
*/
println "+++ Adding items on especific index"
println "substitution"
previous(); printOut(list)
list.putAt(3,'tiger')
after(); printOut(list)
println " new items on the List"
list.putAt(7,'tiger')
after(); printOut(list)
println "Other ways"
list[5]='mouse'
list << 'horse'
after(); printOut(list)

/* Using + operator we get a new object and
        it is needed to store it on a new variable if we like to recover or use it later */

previous(); printOut(list)
list + ['bat']
after(); printOut(list)
newList = list + ['bat']
after(); printOut(newList)
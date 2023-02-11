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

ArrayList list = ['cat', 'dog', 'bird', 'whole','tiger']

// Add a list inside
previous(); printOut(list)
list << ['ant','turtle']
println "+++ We add a list inside, this is the output"
after(); printOut(list)

// Some kind of magic
println "+++ Flatten a list, if it was used later, store in a variable"
ArrayList listFlatten = list.flatten()
println listFlatten

//Unique
println "+++ Unique method could be usefully after add a duplicate item"
listFlatten << 'ant'
printOut(listFlatten)
list = listFlatten.unique()
after(); printOut(list)


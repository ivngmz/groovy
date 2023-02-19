package Collections

List list = ['cat', 'dog', 'bird', 'whole','tiger']

//each && each with index
println "+++ Example each"
list.each {
    print it + " "
}

println "+++ Example eachWithIndex"
list.eachWithIndex{ String entry, int i ->
    println i:entry + " "
}
println ""

// findAll method to search inside collection
println "+++ Use of findAll"
List listSelected1 = list.findAll(){
    if (it.contains('i')) {
        println  it
    }
}



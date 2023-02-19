package conditionalStructures

List list = (1..10).toList()
list2 = list

assert list

for (Integer i in 1..10) {
    println i
}

for (String s in 'a'..'z') {
    if (s < 'm') { println s; continue }
    else { break }
}
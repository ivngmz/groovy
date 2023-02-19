package conditionalStructures

List list = ['cat', 'dog', 'bird', 'whole','tiger']

println list.size()

if ( list.size() < 2 ) {
    println "the size is minor to 2"
}
else if (list.size() == 5 ) {
    println "the size is 5"
}
else {
    println "the size is not 5 neither than minus to 2"
}

(list.size() == 5) ? (println "the size is 5") : (println "the size is not 5")
(list.size() == 4) ? (println "the size is 5") : (println "the size is not 5")
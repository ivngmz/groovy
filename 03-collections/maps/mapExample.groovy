package maps


def printOut(map) {
    println map.getClass().name
    println(map)
}

def previous(){
    println "########################"
    println "Previous List:"
}

def after() {
    println "After change:"
}

Map map = [:]

map = [animals:['cat':'black', 'dog':'white', 'bird':'red'],vegetables:['onion':'white']]

previous(); printOut(map)

println "+++ Example de partial map output"
previous(); printOut(map.animals)

println "+++ Adds a new map"
map.minerals = ['sal':'white']
println map.minerals
println "+++ Overwrite existent map"
Map newBranch = ['graphite':'grey']
map.minerals = newBranch
println map.minerals
println "+++ Insert map"
map.minerals.putIfAbsent('selenium','grey')
//map = [animals:['cat':'black', 'dog':'white', 'bird':'red'],vegetables:['onion':'white'],(newBranch)]
println map.minerals

println map.size()
println map.sort()

println "+++ Show entries"
for (entry in map) {
    println entry
}

println "+++ Show a key set"
for (key in map.keySet()) {
    println "$key:${map[key]}"
}


after(); printOut(map)
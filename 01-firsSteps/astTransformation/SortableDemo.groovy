package astTransformation

import groovy.transform.*

@ToString
@Sortable
class Person {
    String first
    String last
}

def p2 = new Person(first:"Ivan",last:"Gomez")
def p1 = new Person(first:"Andrea",last:"Rarmos")


def people = [p1,p2]

println people

def sorted = people.sort(false)
println sorted
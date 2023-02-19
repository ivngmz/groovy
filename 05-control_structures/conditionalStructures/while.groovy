package conditionalStructures

List list = [1,2,3]

while (list) {
    println list
    list.pop()
}

assert list == []


a=1
while (true) {
    a++
    break
}
assert a == 2

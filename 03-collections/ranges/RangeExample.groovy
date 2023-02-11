package ranges


for (int x = 1; x <= 10; ++x) {
    println "$x\n"
}

def letters = ['a','b','c']

for (int i = 10 ; i <= letters.size(); i-- ) {
    println letters[i]
}


Range range1 = 1..5
println range1.class

println range1

assert (1..10).contains(2)
assert (1..10).contains(11) == false
assert !(1..10).contains(11)

Date today = new Date()
println today
Date oneWeekAway =  today + 7
println(oneWeekAway)

Range days = (today..oneWeekAway)
days.each {println(it)}


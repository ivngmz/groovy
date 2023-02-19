package creatingClorures


def c = { name ->
    println "hello $name"
}
println c.getClass().name
println c instanceof Closure
c('Andres')

List nums = [1,42,54,66,7,2,3,41]
nums.each{item ->
    println(item)
}

// closures are object and last parameter

def timesTen(num,closure){
    closure(num * 10)
}
timesTen(10,{println it})

// Last argument could be writen out of parenthesis
timesTen(123){println it}

import java.util.Random

Random random  = new Random()
20.times {
    println random.nextInt()
}
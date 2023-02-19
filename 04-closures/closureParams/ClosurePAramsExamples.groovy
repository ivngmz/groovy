package closureParams

// Implicit parameter
def implicitParams = {
    println it
}
implicitParams('Ivan')

// No params
def noParams = {
    println('No params')
}
noParams()

// Multiple parameter
def sayHello = { String first, String last ->
    println "Hello $first $last"
}
sayHello('Ivan','Ropero')

// varargs example, giving no declared number of params
def concat = { String...args ->
    println(args.join(' '))
}
concat('what','the','fuck')

def  checkClosure(Closure c) {
    println c.toString()
    println c.maximumNumberOfParameters
    println c.parameterTypes.getClass().name
}
checkClosure(concat)
checkClosure(sayHello)
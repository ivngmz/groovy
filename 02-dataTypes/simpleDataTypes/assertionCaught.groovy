package simpleDataTypes

try {assert 'ab' == 'a' + 'a'; println "Good!"} catch(AssertionError e){ println "error" }

assert 2 == 2.5.toInteger() // Conversion
assert 2 == 2.5 as Integer // Enforced coercion
assert 2 == (int) 2.5 // Casting
assert '5.50'.isNumber()
assert 5 == '5'.toInteger()
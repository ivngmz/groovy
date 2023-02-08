package workingWithStrings

// Working with Strings in Groovy

// Java ::

char c = 'c'
println ("c" + c.class)

String str = "this is a string"
println ("str " + str.class)

// Groovy ::

// String interpolaction/
//              \double quote hel to resolve operatios  and variable
String name = "Ivan"
String msg = "Hello'sss" + name
println msg
String msg2 = "Hello'sss  ${name}"
println msg2
String msg3 = "Hello'sss  ${1 + 1}"
println msg3

// Dollar slashing

def folder  = "C:\\groovy\\folder"
def folder2  = $/"C:\\groovy\folder"/$


String[] arrayString = ['uno','dos']
println ("arrayString " + arrayString.class)
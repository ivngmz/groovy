package workingWithStrings

//Java Sample Pattern

import java.util.regex.*
//Pattern pattern = Pattern.compile("a\\\\b")
//println pattern
//println pattern.class

String slashy = /a\b/
String url = $/http://trytofind.dot.com/jam/$

//println slashy.class
//def pattern = ~/a\b/
//println pattern.class

// Find  | Match
def  text = "Testing low and find file it's ok"
def pattern = ~/low and find/
def finder = text  =~ pattern

println finder
println finder.size()
println finder.matches()
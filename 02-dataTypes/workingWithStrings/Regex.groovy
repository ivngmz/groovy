package workingWithStrings

// Groovy have some operators to work with regex:
// =~      |   find operator    | Could be used to build a java.util.regex.Matcher instance
// ==~     |   match operator   | Return a boolean but it is needed a strict match
// ~string |   pattern operator | Create a regex.Pattern instance




def pattern = ~"e.+?s"
println pattern.getClass()
def matcher = pattern.matcher("aggressiveness")
while (matcher.find()) {
    printf "match: %s, start: %s end: %s%n",
            matcher.group(), matcher.start(), matcher.end()
}

//def matcher = "aggressiveness" =~ "e.+?s"
//while (matcher.find()) {
//    printf "match: %s, start: %s end: %s%n",
//            matcher.group(), matcher.start(), matcher.end()
//}
//
//def match = "aggressiveness" ==~ ".*ess.*"
//println match
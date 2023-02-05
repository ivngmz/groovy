#!/usr/bin/env groovy
package examples

// Example of groovy shebang: #!/usr/bin/env groovy
// This is a single line comment: importing the class MarkupBuilder

/* This is a multiple line comment:
        importing the
                lass MarkupBuilder*/

/**This is a doc comment:
 *        importing the
 *       lass MarkupBuilder
 */

import groovy.xml.MarkupBuilder

// using the imported class to create an object
def xml = new MarkupBuilder()
def say_hello() { println "hello" }

xml
say_hello()
if ( xml != null ) { println ("True") }
else { println("False")}

assert 1 == 1

Date date = new Date()
println(date)

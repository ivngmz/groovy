package astTransformation

import groovy.transform.Canonical

@Canonical
class Customer {
    String first, last
    int age
    Date since
    Collection favItems = ['Food']
    def object
}

def d = new Date()
def anyObject = new Object()
def c1 = new Customer(first: 'Tomas', last:'Dominguez',age:22,since:d,favItems: ['Books','Games'],object:anyObject)
def c2 = new Customer('Tomas','Dominguez',22,d,['Books','Games'],anyObject)

assert c1 == c2
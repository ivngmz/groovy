package conditionalStructures


def num = 1
def list = [1,2,1,4,3,5,6,4,6,7 ]

def test(num) {
    switch (num) {
        //case Integer -> println "Its an integer"
        case 1 -> println 'number is equal to 1'
        case 2 -> println 'number is equal to 2'
        case 3 -> println 'number is equal to 3'
        case 4 -> println 'number is equal to 4'
        case [5,7] -> println 'number is in list [5,7]'
        case 1..5 -> println 'number is contained in range 1 to 5'
        default -> println 'default output - number could not be identified'
    }
}
list.each {test(it)}
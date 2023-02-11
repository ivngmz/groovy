package Lists

def printOut(nums) {
    println nums.class
    println(nums)
}

// Create a list
nums = [1,2,3,4,5]
printOut(nums)

List nums = [1,2,3,4,5]
printOut(nums)

//ArrayList nums = [1,2,3,4,5]
//printOut(nums)

nums = [1,2,3,4,5] as LinkedList
printOut(nums)


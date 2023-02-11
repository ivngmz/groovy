package Collections

stringCSV='a,b,c,f,d,e,r,t,y,y,u,j,k'

collectionLetters=stringCSV.split(',')

println collectionLetters

List collectionParent = collectionLetters
println collectionParent.class
println collectionParent

lengthParent = collectionParent.size().toInteger()
println(lengthParent)
slideLimit = lengthParent.div(2).toInteger()
println slideLimit

collectionChild1 = collectionParent.subList(0,slideLimit.toInteger())
println collectionChild1
collectionChild2=collectionParent.subList(slideLimit.toInteger(),lengthParent)
println collectionChild2

def printCollection(List list) {
    list.each { it ->
        println it
    }
}

printCollection(collectionChild1)
println "############# slide limit #################"
printCollection(collectionChild2)

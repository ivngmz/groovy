package curryMethods

def log = { String type,  Date createdOn, String msg ->
    println "$createdOn [$type] $msg"
}
log('DEBUG',new Date(),'- Check it is running')

println "+++ Example of curry method applied"
def debugLog = log.curry("DEBUG",new Date())
debugLog('- Check it is running')
debugLog('- Check it is running again')

// rcurry right curry
def debugLogRight = log.rcurry('- Check it is running rcurry')
debugLogRight("DEBUG",new Date())

// ncurry
def debugLogN = log.ncurry(2,'- Check it is running ncurry')
debugLogN("DEBUG",new Date())
package conditionalStructures

import java.nio.file.FileAlreadyExistsException

def foo() {
    throw new FileAlreadyExistsException("ERROR: Foo Exception")
}

List log = []
try {
    foo()
} catch (NullPointerException | FileAlreadyExistsException e) {
    log << e.message
} finally {
    log << "finally"
}
log.each { it -> println it}
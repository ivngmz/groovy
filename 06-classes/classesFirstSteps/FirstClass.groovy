package classesFirstSteps

class ExampleClass {
    String nameOfclass, pseudoName
    def dob
    protected f1,f2
    private Date createdOn = new Date()

    static messageDefault = "Hello"
    public static final String RECORD_NO = "001"

    def foo() {
        String record = "1234"
    }
}

println ExampleClass.messageDefault

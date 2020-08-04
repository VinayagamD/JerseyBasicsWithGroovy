import spock.lang.Specification

class FirstExample extends Specification {

    def "We are going to see max value using Math class" () {
        expect:
            Math.max(2,3) == 3
    }

    def "Fail the test case"(){
        expect:
            Math.max(2,3) != 4
    }
}

import spock.lang.Shared
import spock.lang.Specification

/**
 * Spock Test cases for class SumOfTwoNumbers
 */
class SumOfTwoNumbersTest extends Specification {

    // instance fields
    @Shared obj = new SumOfTwoNumbers()

    def "Feature method one"() {
        given:
            obj
    }

    def "Feature method two"(){
        given:
            obj
    }
}

import spock.lang.Specification

class FourthExample extends Specification {

    def "feature method without explicit block"(){
       setup:
        println "here we are in feature block method"
        def a = 5
        def b = 6
        def obj = new SumOfTwoNumbers()
       expect:
        println "here we are in feature block method"
    }

    def "feature method for using conditional block"(){
        setup:
            def a = 5
            def b = 6
            def obj = new SumOfTwoNumbers()
        when:
            def sum = obj.adder(a, b)
        then:
            sum == 11

        when:
            def list = []
            list.add(3)
            list.add(4)
        then:
            list.size() == 2
        when:
            list = []
            list.add(3)
            list.add(4)
            println list.get(5)
        then:
            thrown(IndexOutOfBoundsException)
            println "Finally we have thrown the exception"
        expect:
            Math.max(2,3) == 3
        cleanup:
            println "we are line"


    }
}

import spock.lang.Specification

/**
 * To Study about fixtures in spock
 */
class FixtureExample extends Specification{

    def setupSpec(){
        println "we are in setup spec"
    }

    def setup(){
        println "we are in setup fixture"
    }

    def "feature method one"(){
        given:
         println "we are in feature method one"
    }

    def "feature method second"(){
        given:
         println "we are in feature method second"
    }

    def "feature method 3"(){
        given:
            println "we are in feature method 3"
    }

    def cleanup(){
        println "we are in cleanup method"
    }

    def cleanupSpec(){
        println "we are in cleanup spec"
    }


}

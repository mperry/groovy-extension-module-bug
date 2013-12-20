package com.github.mperry.fg

import groovy.transform.TypeChecked
import org.junit.Test

@TypeChecked
class Example {

    @Test
    void test1() {
        println "First FunctionalGroovy demo"
        1.to(5).each {
            println it
        }
    }

}

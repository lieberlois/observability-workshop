package com.github.olly.workshop.imageflip

import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest
import spock.lang.Specification

@DataMongoTest
class ImageflipApplicationTests extends Specification {

    def "context loads"() {
        when:
        true

        then:
        true
    }
}

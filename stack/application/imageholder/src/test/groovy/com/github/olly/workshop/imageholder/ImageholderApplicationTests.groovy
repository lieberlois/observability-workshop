package com.github.olly.workshop.imageholder

import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import spock.lang.Specification

@SpringBootTest
@AutoConfigureDataMongo
@TestPropertySource(properties = ["honeycomb.beeline.enabled=false"])
class ImageholderApplicationTests extends Specification {

    def "context loads"() {
        when:
        true

        then:
        true
    }
}

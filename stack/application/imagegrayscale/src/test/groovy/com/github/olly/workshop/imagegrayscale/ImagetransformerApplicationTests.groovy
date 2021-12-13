package com.github.olly.workshop.imagegrayscale;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import spock.lang.Specification;

@SpringBootTest
@TestPropertySource(properties = ["honeycomb.beeline.enabled=false"])
class ImagetransformerApplicationTests extends Specification {

    def "context loads"() {
        when:
        true

        then:
        true
    }

}


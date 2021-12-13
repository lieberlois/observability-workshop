package com.github.olly.workshop.imageorchestrator

import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration
import org.springframework.cloud.openfeign.FeignAutoConfiguration
import spock.lang.Specification

@ImportAutoConfiguration([RibbonAutoConfiguration.class, FeignAutoConfiguration.class])
@SpringBootTest
class ImageorchestratorApplicationTests extends Specification {

    def "context loads"() {
        when:
        true

        then:
        true
    }
}

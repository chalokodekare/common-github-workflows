/*
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.skeleton


import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [ResourceSpec.class])
class ResourceSpec extends Specification {

    @Value('${chalocodekare.test.config}')
    private String testConfigValue;

    def setup() {
    }

    def "verify test config values"() {
        given: "configurations"

        when: "fetching values from configuration"

        then: "value should not be null"
        assert testConfigValue == "123"
    }
}

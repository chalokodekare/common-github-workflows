/*
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.skeleton.controller

import com.chalocodekare.skeleton.constants.ApiConstants
import javax.servlet.http.HttpServletResponse
import spock.lang.Specification

class HealthCheckControllerSpec extends Specification {
    HealthCheckController controller

    def setup() {
        controller = new HealthCheckController()
    }

    def "test health check api flow"() {
        given: "response mock"
        HttpServletResponse responseMock = Mock(HttpServletResponse)

        when: "call health check api method"
        controller.redirectHealth(responseMock)

        then: "call should be redirected to actuator end point"
        1 * responseMock.sendRedirect(ApiConstants.ACTUATOR_HEALTH_CHECK_API_END_POINT)
        noExceptionThrown()
    }
}

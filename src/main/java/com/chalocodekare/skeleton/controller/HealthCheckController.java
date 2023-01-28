/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.skeleton.controller;

import static com.chalocodekare.skeleton.constants.ApiConstants.ACTUATOR_HEALTH_CHECK_API_END_POINT;
import static com.chalocodekare.skeleton.constants.ApiConstants.HEALTH_CHECK_API_END_POINT;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping(HEALTH_CHECK_API_END_POINT)
    void redirectHealth(HttpServletResponse response) throws IOException {
        response.sendRedirect(ACTUATOR_HEALTH_CHECK_API_END_POINT);
    }
}

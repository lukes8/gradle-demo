package com.lukes.learning.gradledemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/applicationInfo")
public class ApplicationInfoController {

    @RequestMapping(method = RequestMethod.GET)
    public String getAppInfo() {
        return "Application is running on spring boot under Gradle as built tool";
    }
}

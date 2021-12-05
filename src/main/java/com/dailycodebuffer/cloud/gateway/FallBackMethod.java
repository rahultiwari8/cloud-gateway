package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethod {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallbackMethod()
    {
        return "User service is taking longer than expected .Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack()
    {
        return "Department service is taking longer than expected .PLease try again later";
    }

}

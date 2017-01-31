package com.dependentlearners.security.ping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class PingApplication {

    @RequestMapping("/*")
    @ResponseBody
    public String ping() {
        return "ping";
    }

    public static void main(String[] args) {
        SpringApplication.run(PingApplication.class);
    }
}

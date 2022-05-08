package com.socurites.demo.api;

import com.socurites.demo.model.Greeting;
import com.socurites.demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.concurrent.TimeUnit;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));

        return Greeting.builder()
                .content("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!")
                .build();
    }
}

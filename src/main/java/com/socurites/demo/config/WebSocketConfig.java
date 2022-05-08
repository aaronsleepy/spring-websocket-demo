package com.socurites.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

import java.util.List;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(final MessageBrokerRegistry registry) {
        // Enable a simple memory-based message broker
        // to carry the greeting messages back to the client
        // on destinations prefixed with /topic
        registry.enableSimpleBroker("/topic");

        // Designates the /app prefix for messages that are bound for methods
        // annotated with @MessageMapping
        // For example, /app/hello is the endpoint
        // that the GreetingController.greeting() method is mapped to handle
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(final StompEndpointRegistry registry) {
        // Registers the /demo-websocket endpoint,
        // enabling SockJS fallback options so that alternate transports can be used
        // if WebSocket is not available
        registry.addEndpoint("/demo-websocket")
                .withSockJS();
    }
}

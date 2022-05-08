package com.socurites.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Example reply format: { "content": "Hello, Fred!" }
 */
@AllArgsConstructor
@Getter
@Builder
public class Greeting {
    private final String content;
}

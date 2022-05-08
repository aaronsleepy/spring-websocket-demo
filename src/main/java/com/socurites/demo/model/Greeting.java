package com.socurites.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Example reply format: { "content": "Hello, Fred!" }
 */
@AllArgsConstructor
@Getter
public class Greeting {
    private final String content;
}

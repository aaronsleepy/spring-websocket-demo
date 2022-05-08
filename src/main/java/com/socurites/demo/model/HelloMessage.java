package com.socurites.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Example message format: { "name": "Fred" }
 *
 */
@AllArgsConstructor
@Getter
public class HelloMessage {
    private final String name;
}

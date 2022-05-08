package com.socurites.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Example message format: { "name": "Fred" }
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HelloMessage {
    private String name;
}

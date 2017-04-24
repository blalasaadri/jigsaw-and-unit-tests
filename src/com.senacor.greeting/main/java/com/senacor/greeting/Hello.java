package com.senacor.greeting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Hello {

    public String greet(String... names) {
        if ((names == null) || (names.length == 0)) {
            return "Hello World";
        } else {
            return Arrays.stream(names)
                    .map(name -> String.format("Hello %s!", name))
                    .collect(Collectors.joining("\n"));
        }
    }
}

package com.polovyi.ivan.tutorials;

public record GenericRecord<T>(T parameter) {

    T getParameter() {
        return parameter;
    }
}

package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record InstanceMethod(long id,
                             String fullName,
                             String phoneNumber,
                             String address,
                             LocalDate createdAt) {

    public void printCreatedAt() {
        System.out.println("createdAt = " + createdAt);
    }

    @Override
    public long id() {
        return 1000000L + id;
    }

    public long id(long prefix) {
        return prefix + id;
    }



// won't compile
//    public String id() {
//        return "prefix" + id;
//    }
}

package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record CompactCanonicalConstructor(long id,
                                          String fullName,
                                          String phoneNumber,
                                          String address,
                                          LocalDate createdAt) {

    public CompactCanonicalConstructor {
        // won't compile
        // this(1l, "FullName", "+17737278341", "address", LocalDate.now());
        if (createdAt == null) {
            createdAt = LocalDate.now();
        }
        System.out.println("Inside Compact canonical constructor.");
    }
}

package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record ExplicitCanonicalConstructor(long id,
                                           String fullName,
                                           String phoneNumber,
                                           String address,
                                           LocalDate createdAt) {

    public ExplicitCanonicalConstructor(long id, String fullName, String phoneNumber,
            String address, LocalDate createdAt) {
        System.out.println("Inside explicit canonical constructor.");
        if (createdAt == null) {
            createdAt = LocalDate.now();
        }
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.createdAt = createdAt;
    }

}

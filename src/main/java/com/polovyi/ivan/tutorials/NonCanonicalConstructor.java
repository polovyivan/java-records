package com.polovyi.ivan.tutorials;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public record NonCanonicalConstructor(long id,
                                      String fullName,
                                      String phoneNumber,
                                      String address,
                                      LocalDate createdAt) {

    public NonCanonicalConstructor() throws Exception{
        this(1l, "FullName", "+17737278341", "address", LocalDate.now());
        System.out.println("Inside no-arg non canonical constructor");
    }

    protected NonCanonicalConstructor(long id) throws InvalidParameterException {
        this(id, "FullName", "+17737278341", "address", LocalDate.now());
        System.out.println("Inside non canonical constructor");
    }

     //won't compile
     // public NonCanonicalConstructor(long id, String fullName) {}
}

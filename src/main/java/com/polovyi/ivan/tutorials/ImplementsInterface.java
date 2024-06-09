package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record ImplementsInterface(long id,
                                  String fullName,
                                  String phoneNumber,
                                  String address,
                                  LocalDate createdAt) implements User {

    @Override
    public String getUsername() {
        return "UserName";
    }
}

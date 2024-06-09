package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record InstanceFields(long id,
                             String fullName,
                             String phoneNumber,
                             String address,
                             LocalDate createdAt) {
    //  private String instanceField;

//    {
//        id = 1L;
//    }
}

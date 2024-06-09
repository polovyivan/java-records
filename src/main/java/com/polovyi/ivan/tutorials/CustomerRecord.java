package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record CustomerRecord(long id,
                             String fullName,
                             String phoneNumber,
                             String address,
                             LocalDate createdAt) {
}

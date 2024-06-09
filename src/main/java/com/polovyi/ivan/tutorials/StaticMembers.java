package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public record StaticMembers(long id,
                            String fullName,
                            String phoneNumber,
                            String address,
                            LocalDate createdAt) {

    private static final String STATIC_STRING;

    static {
        STATIC_STRING = "static string 1";
    }

    private static final String STATIC_STRING_2 = "static string 2";

    public static String getStaticString() {
        return STATIC_STRING_2;
    }

    public enum RecordEnum {
        YES, NO
    }

}

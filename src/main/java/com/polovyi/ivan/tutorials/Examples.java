package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public class Examples {

    public static void main(String[] args) {
        GenericRecord<String> genericRecord = new GenericRecord<>("GenericRecord");
        String strParameter = genericRecord.getParameter();
        System.out.println("strParameter = " + strParameter);

        GenericRecord<Long> genericRecord2 = new GenericRecord<>(1L);
        Long longParameter = genericRecord2.getParameter();
        System.out.println("longParameter = " + longParameter);

        CustomerRecord customerRecord = new CustomerRecord(1l, "FullName", "+17737278341", "address", LocalDate.now());
        CompactCanonicalConstructor compactCanonicalConstructor = new CompactCanonicalConstructor(1l,
                "FullName",
                "+17737278341",
                "address",
                null);
        // won't compile
        // CompactCanonicalConstructor crCompactCanonicalConstructor2 = new CompactCanonicalConstructor();

    }
}



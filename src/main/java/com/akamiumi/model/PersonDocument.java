package com.akamiumi.model;

public enum PersonDocument {
    ID_CARD_RUZ(0),
    PASSPORT_CITIZEN(1),
    MILITARY_ID(2),
    SERVICE_ID(3),
    PASSPORT_FOREIGN(4),
    RESIDENT_CARD(5),
    BIOMETRIC_PASSPORT_CITIZEN(6),
    BIRTH_CERTIFICATE(7),
    NEW_DRIVERS_LICENSE(8),
    OTHER(9);


    PersonDocument(final int newValue) {
    }
}


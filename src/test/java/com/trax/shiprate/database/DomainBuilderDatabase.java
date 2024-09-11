package com.trax.shiprate.database;


import com.trax.shiprate.common.ActiveEnum;
import com.trax.shiprate.database.db.entity.Account;
import com.trax.shiprate.database.db.entity.User;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class DomainBuilderDatabase {
    public static String NAME = "Name_";
    public static String DESCRIPTION = "Desc_";

    // ///////////////////////////////////////////////////////////////////
    public static Account getAccount() {
        return getAccount(null, null, null);
    }

    public static Account getAccount(String name) { return getAccount(name, null, null); }
    public static Account getAccount(
            String thisName,
            String thisDescription,
            String thisExtId
    ) {
        String random = getRandom();
        Account item = new Account();
        item.setExtid(thisExtId != null ? thisExtId : UUID.randomUUID().toString());
        item.setName(thisName != null ? thisName : getNameRandom(random));
        item.setDescription(thisDescription != null ? thisDescription : getDescriptionRandom(random));
        item.setActive(ActiveEnum.ACTIVE.value);
        item.setCreatedAt(LocalDateTime.now());
        item.setModifiedAt(null);
        item.setDeletedAt(null);
        return item;
    }

    public static User getUser() {
        return getUser(null, null);
    }
    public static User getUser(String thisName) {
        return getUser(null, thisName);
    }
    public static User getUser(
            String thisEmail,
            String thisName
    ) {
        String random = getRandom();
        User item = new User();
        item.setEmail(thisEmail != null ? thisEmail : getEmailRandom());
        item.setName(thisName != null ? thisName : getNameRandom(random));
        item.setActive(ActiveEnum.ACTIVE.value);
        item.setCreatedAt(LocalDateTime.now());
        item.setModifiedAt(null);
        item.setDeletedAt(null);
        return item;
    }

    // //////////////////////////////////////////////////////////////////
    public static BigDecimal getBigDecimal(String value) {
        return new BigDecimal(value);
    }

    public static String getDescriptionRandom() {
        return DESCRIPTION + randomString();
    }

    public static String getDescriptionRandom(String random) {
        return DESCRIPTION + random;
    }

    public static String getRandom() {
        return randomString();
    }

    public static String getNameRandom() {
        return NAME + randomString();
    }

    public static String getSymbolRandom() {
        return RandomStringUtils.random(4, true, false).toUpperCase();
    }

    public static String getEmailRandom() {
        String username = RandomStringUtils.random(8, true, false).toLowerCase();
        return username + "@gmail.com";
    }

    public static String getNameRandom(String random) {
        return NAME + random;
    }

    public static final String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static final String getStringTestUUIDTooLong() {
        return "123456789012345678901234567890123456789012345678901234567890";
    }

    public static String randomString() {
        return String.valueOf(new Random().nextInt());
    }

    public static BigDecimal randomBigDecimal() {
        int random = randomPositiveInt(100);
        return new BigDecimal(random);
    }

    public static float randomFloat() {
        return new Random().nextFloat();
    }

    public static long randomLong() {
        return new Random().nextLong();
    }

    public static int randomPositiveInt() {
        return new Random().nextInt();
    }

    public static int randomPositiveInt(int maxValue) {
        return new Random().nextInt(maxValue);
    }

}

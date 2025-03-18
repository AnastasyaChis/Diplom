package data;

import lombok.Value;

import java.util.Random;

public class DataHelper {
    public DataHelper() {

    }

    public static String getCardNumberSuccessfully() {
        return "4444 4444 4444 4441";
    }

    public static String getCardNumberDeclined() {
        return "4444 4444 4444 4442";
    }

    public static String getValidMonth() {
        String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        Random index = new Random();
        int indexInt = index.nextInt(months.length);
        return months[indexInt];
    }


    @Value
    public static class CardInfo {
        String cardNumber;
        String month;
        String year;
        String owner;
        String cvc;
    }
}
package Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {
    private List<String> numbers;
    private List<String> urls;
    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();
    }

    public String call() {
        StringBuilder resultBuilder = new StringBuilder();
        for (String number : numbers) {
            if (number.matches("\\d+")) {
                resultBuilder.append("Calling... " + number);
            } else {
                resultBuilder.append("Invalid number!");
            }
            resultBuilder.append(System.lineSeparator());
        }
        return resultBuilder.toString();
    }

    public String browse() {
        StringBuilder resultBuilder = new StringBuilder();
        for (String url : urls) {
            if (url.matches("[^\\d]+")) {
                resultBuilder.append("Browsing: " + url + "!");
            } else {
                resultBuilder.append("Invalid URL!");
            }
            resultBuilder.append(System.lineSeparator());
        }
        return resultBuilder.toString();
    }
}

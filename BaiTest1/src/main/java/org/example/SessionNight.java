package org.example;

public class SessionNight {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', '1', 'c', '2', '3', 'd', '4', '5', 'e'};
        int sum = 0;
        for (char c : arr) {
            if (Character.isDigit(c)) {
                sum += c;
            }
        }
    }
}

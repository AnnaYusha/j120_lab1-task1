package ru.belova.java;

import java.util.Objects;

public class PhoneNumber {
    private String prefix;
    private String localNumber;

    public PhoneNumber(String prefix, String localNumber) {
        this.prefix = prefix;
        this.localNumber = localNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber number = (PhoneNumber) o;
        return Objects.equals(prefix, number.prefix) &&
                Objects.equals(localNumber, number.localNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, localNumber);
    }

    @Override
    public String toString() {
        return "(" +
                prefix + ")" +
                divide(localNumber);
    }

    private String divide(String localNumber) {
        StringBuilder sb = new StringBuilder();
        if (localNumber.length() == 6) {
            sb.append(localNumber.substring(0, 2)).append("-").append(localNumber.substring(2, 4)).append("-").append(localNumber.substring(4));
        } else if (localNumber.length() == 7) {
            sb.append(localNumber.substring(0, 3)).append("-").append(localNumber.substring(3, 5)).append("-").append(localNumber.substring(5));
        }
        return sb.toString();
    }
}

package com.charan.Programs;

public class StringMethods {
    public static void main(String[] args) {
        // Initial string declarations
        String str1 = "Hello World";
        String str2 = "HELLO WORLD";
        String str3 = "hello";
        String str4 = " Java ";
        char[] charArray = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };

        // 1. charAt() - Returns the character at the specified index
        System.out.println("1. charAt(1): " + str1.charAt(1));
        System.out.println("   String: \"" + str1 + "\"");

        // 2. codePointAt() - Returns Unicode value of the character at the specified index
        System.out.println("2. codePointAt(1): " + str1.codePointAt(1));
        System.out.println("   String: \"" + str1 + "\"");

        // 3. codePointBefore() - Returns Unicode value of the character before the specified index
        System.out.println("3. codePointBefore(1): " + str1.codePointBefore(1));
        System.out.println("   String: \"" + str1 + "\"");

        // 4. codePointCount() - Returns number of Unicode values in a substring
        System.out.println("4. codePointCount(0, 5): " + str1.codePointCount(0, 5));
        System.out.println("   String: \"" + str1 + "\"");

        // 5. compareTo() - Compares two strings lexicographically
        System.out.println("5. compareTo(): " + str1.compareTo(str2));
        System.out.println("   String 1: \"" + str1 + "\"");
        System.out.println("   String 2: \"" + str2 + "\"");

        // 6. compareToIgnoreCase() - Compares two strings ignoring case
        System.out.println("6. compareToIgnoreCase(): " + str1.compareToIgnoreCase(str2));
        System.out.println("   String 1: \"" + str1 + "\"");
        System.out.println("   String 2: \"" + str2 + "\"");

        // 7. concat() - Concatenates two strings
        System.out.println("7. concat(): " + str1.concat(str4.trim()));
        System.out.println("   String 1: \"" + str1 + "\"");
        System.out.println("   String 2: \"" + str4.trim() + "\"");

        // 8. contains() - Checks if string contains a sequence of characters
        System.out.println("8. contains(\"World\"): " + str1.contains("World"));
        System.out.println("   String: \"" + str1 + "\"");

        // 9. contentEquals() - Checks if content is equal to another CharSequence
        System.out.println("9. contentEquals(): " + str1.contentEquals("Hello World"));
        System.out.println("   String: \"" + str1 + "\"");

        // 10. copyValueOf() - Converts char array to string
        System.out.println("10. copyValueOf(): " + String.copyValueOf(charArray));
        System.out.println("   Char Array: " + String.valueOf(charArray));

        // 11. endsWith() - Checks if string ends with specified suffix
        System.out.println("11. endsWith(\"ld\"): " + str1.endsWith("ld"));
        System.out.println("   String: \"" + str1 + "\"");

        // 12. equals() - Checks if strings are exactly equal
        System.out.println("12. equals(): " + str1.equals(str2));
        System.out.println("   String 1: \"" + str1 + "\"");
        System.out.println("   String 2: \"" + str2 + "\"");

        // 13. equalsIgnoreCase() - Compares two strings ignoring case
        System.out.println("13. equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
        System.out.println("   String 1: \"" + str1 + "\"");
        System.out.println("   String 2: \"" + str2 + "\"");

        // 14. format() - Returns formatted string
        System.out.println("14. format(): " + String.format("My name is %s and I am %d years old.", "Charan", 25));
        System.out.println("   Format String: \"My name is %s and I am %d years old.\"");

        // 15. getBytes() - Converts string to byte array
        byte[] byteArray = str1.getBytes();
        System.out.println("15. getBytes(): " + byteArray.length);
        System.out.println("   String: \"" + str1 + "\"");

        // 16. getChars() - Copies characters into a char array
        char[] destArray = new char[5];
        str1.getChars(0, 5, destArray, 0);
        System.out.println("16. getChars(): " + String.valueOf(destArray));
        System.out.println("   String: \"" + str1 + "\"");

        // 17. hashCode() - Returns hash code of the string
        System.out.println("17. hashCode(): " + str1.hashCode());
        System.out.println("   String: \"" + str1 + "\"");

        // 18. indexOf() - Returns index of first occurrence of a substring
        System.out.println("18. indexOf(\"World\"): " + str1.indexOf("World"));
        System.out.println("   String: \"" + str1 + "\"");

        // 19. intern() - Returns the canonical representation of string
        String str5 = new String("Hello").intern();
        System.out.println("19. intern(): " + (str1.substring(0, 5) == str5));
        System.out.println("   Substring of str1: \"" + str1.substring(0, 5) + "\"");
        System.out.println("   Interned String: \"" + str5 + "\"");

        // 20. isEmpty() - Checks if string is empty
        System.out.println("20. isEmpty(): " + str1.isEmpty());
        System.out.println("   String: \"" + str1 + "\"");

        // 21. join() - Joins strings with a delimiter
        System.out.println("21. join(): " + String.join("-", "2024", "09", "14"));
        System.out.println("   Strings to Join: \"2024\", \"09\", \"14\"");

        // 22. lastIndexOf() - Returns index of last occurrence of a substring
        System.out.println("22. lastIndexOf(\"l\"): " + str1.lastIndexOf("l"));
        System.out.println("   String: \"" + str1 + "\"");

        // 23. length() - Returns length of the string
        System.out.println("23. length(): " + str1.length());
        System.out.println("   String: \"" + str1 + "\"");

        // 24. matches() - Checks if the string matches a regex pattern
        System.out.println("24. matches(): " + str1.matches(".*World.*"));
        System.out.println("   String: \"" + str1 + "\"");

        // 25. offsetByCodePoints() - Returns the index by offsetting code points
        System.out.println("25. offsetByCodePoints(): " + str1.offsetByCodePoints(1, 1));
        System.out.println("   String: \"" + str1 + "\"");

        // 26. regionMatches() - Tests if two string regions are equal
        System.out.println("26. regionMatches(): " + str1.regionMatches(6, "World", 0, 5));
        System.out.println("   String 1: \"" + str1 + "\"");
        System.out.println("   String 2: \"World\"");

        // 27. replace() - Replaces all occurrences of a character with another character
        System.out.println("27. replace(): " + str1.replace('l', 'p'));
        System.out.println("   String: \"" + str1 + "\"");

        // 28. replaceAll() - Replaces all occurrences of a regex with a string
        System.out.println("28. replaceAll(): " + str1.replaceAll("World", "Java"));
        System.out.println("   String: \"" + str1 + "\"");

        // 29. replaceFirst() - Replaces the first occurrence of a regex with a string
        System.out.println("29. replaceFirst(): " + str1.replaceFirst("l", "p"));
        System.out.println("   String: \"" + str1 + "\"");

        // 30. split() - Splits the string by a delimiter
        String[] parts = str1.split(" ");
        System.out.println("30. split(): " + parts[0] + ", " + parts[1]);
        System.out.println("   String: \"" + str1 + "\"");

        // 31. startsWith() - Checks if string starts with the specified prefix
        System.out.println("31. startsWith(): " + str1.startsWith("He"));
        System.out.println("   String: \"" + str1 + "\"");

        // 32. subSequence() - Returns a subsequence of characters
        System.out.println("32. subSequence(): " + str1.subSequence(0, 5));
        System.out.println("   String: \"" + str1 + "\"");

        // 33. substring() - Returns a substring of the string
        System.out.println("33. substring(): " + str1.substring(6));
        System.out.println("   String: \"" + str1 + "\"");

        // 34. toCharArray() - Converts string to char array
        char[] charArray2 = str1.toCharArray();
        System.out.println("34. toCharArray(): " + String.valueOf(charArray2));
        System.out.println("   String: \"" + str1 + "\"");

        // 35. toLowerCase() - Converts string to lowercase
        System.out.println("35. toLowerCase(): " + str2.toLowerCase());
        System.out.println("   String: \"" + str2 + "\"");

        // 36. toString() - Returns the string itself
        System.out.println("36. toString(): " + str1.toString());
        System.out.println("   String: \"" + str1 + "\"");

        // 37. toUpperCase() - Converts string to uppercase
        System.out.println("37. toUpperCase(): " + str1.toUpperCase());
        System.out.println("   String: \"" + str1 + "\"");

        // 38. trim() - Removes leading and trailing spaces
        System.out.println("38. trim(): " + str4.trim());
        System.out.println("   String: \"" + str4 + "\"");

        // 39. valueOf() - Converts various types to string
        System.out.println("39. valueOf(): " + String.valueOf(123));
        System.out.println("   Value: 123");
    }
}

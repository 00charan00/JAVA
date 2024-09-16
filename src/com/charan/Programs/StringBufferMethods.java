package com.charan.Programs;

import java.util.Arrays;

public class StringBufferMethods {
    public static void main(String[] args) {
        // Create a new StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("1. append(): " + sb);
        // Syntax: public StringBuffer append(CharSequence seq)
        // Output: Hello World

        // 2. length()
        System.out.println("2. length(): " + sb.length());
        // Syntax: public int length()
        // Output: 11

        // 3. capacity()
        System.out.println("3. capacity(): " + sb.capacity());
        // Syntax: public int capacity()
        // Output: 21 (depends on initial capacity and length)

        // 4. charAt()
        System.out.println("4. charAt(6): " + sb.charAt(6));
        // Syntax: public char charAt(int index)
        // Output: W

        // 5. insert()
        sb.insert(6, "Java ");
        System.out.println("5. insert(6, 'Java '): " + sb);
        // Syntax: public StringBuffer insert(int offset, CharSequence seq)
        // Output: Hello Java World

        // 6. delete()
        sb.delete(6, 11);
        System.out.println("6. delete(6, 11): " + sb);
        // Syntax: public StringBuffer delete(int start, int end)
        // Output: Hello World

        // 7. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("7. deleteCharAt(5): " + sb);
        // Syntax: public StringBuffer deleteCharAt(int index)
        // Output: HelloWorld

        // 8. replace()
        sb.replace(0, 5, "Hi");
        System.out.println("8. replace(0, 5, 'Hi'): " + sb);
        // Syntax: public StringBuffer replace(int start, int end, String str)
        // Output: HiWorld

        // 9. reverse()
        sb.reverse();
        System.out.println("9. reverse(): " + sb);
        // Syntax: public StringBuffer reverse()
        // Output: dlroW iH

        // 10. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("10. Capacity after ensureCapacity: " + sb.capacity());
        // Syntax: public void ensureCapacity(int minimumCapacity)
        // Output: 50 (or higher, depending on initial capacity and growth policy)

        // 11. codePointAt()
        System.out.println("11. codePointAt(0): " + sb.codePointAt(0));
        // Syntax: public int codePointAt(int index)
        // Output: 100 (Unicode code point for 'd')

        // 12. codePointBefore()
        System.out.println("12. codePointBefore(1): " + sb.codePointBefore(1));
        // Syntax: public int codePointBefore(int index)
        // Output: 108 (Unicode code point for 'l')

        // 13. codePointCount()
        System.out.println("13. codePointCount(0, 2): " + sb.codePointCount(0, 2));
        // Syntax: public int codePointCount(int beginIndex, int endIndex)
        // Output: 2 (code points in the range)

        // 14. codePoints()
        System.out.println("14. codePoints(): " + Arrays.toString(sb.codePoints().toArray()));
        // Syntax: public IntStream codePoints()
        // Output: [100, 108, 114, 111, 87, 32, 105, 72] (for "dlroW iH")


        // 15. getChars()
        char[] chars = new char[sb.length()];  // Adjust array size to match StringBuffer length
        sb.getChars(0, sb.length(), chars, 0);
        System.out.println("15. getChars(): " + new String(chars));
        // Syntax: public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        // Output: dlroW iH

        // 16. indexOf()
        System.out.println("16. indexOf('iH'): " + sb.indexOf("iH"));
        System.out.println("16. indexOf('iH', 2): " + sb.indexOf("iH", 2));
        // Syntax: public int indexOf(String str)
        // Syntax: public int indexOf(String str, int fromIndex)
        // Output: 6

        // 17. lastIndexOf()
        System.out.println("17. lastIndexOf('iH'): " + sb.lastIndexOf("iH"));
        System.out.println("17. lastIndexOf('iH', 2): " + sb.lastIndexOf("iH", 2));
        // Syntax: public int lastIndexOf(String str)
        // Syntax: public int lastIndexOf(String str, int fromIndex)
        // Output: 6

        // 18. offsetByCodePoints()
        System.out.println("18. offsetByCodePoints(1, 1): " + sb.offsetByCodePoints(1, 1));
        // Syntax: public int offsetByCodePoints(int index, int codePointOffset)
        // Output: 2 (index offset by code point)

        // 19. setCharAt()
        sb.setCharAt(1, 'X');
        System.out.println("19. setCharAt(1, 'X'): " + sb);
        // Syntax: public void setCharAt(int index, char ch)
        // Output: dXroW

        // 20. setLength()
        sb.setLength(5);
        System.out.println("20. setLength(5): " + sb);
        // Syntax: public void setLength(int newLength)
        // Output: dXroW

        // 21. subSequence()
        System.out.println("21. subSequence(1, 3): " + sb.subSequence(1, 3));
        // Syntax: public CharSequence subSequence(int start, int end)
        // Output: Xr

        // 22. substring()
        System.out.println("22. substring(1, 3): " + sb.substring(1, 3));
        System.out.println("22. substring(1): " + sb.substring(1));
        // Syntax: public String substring(int start, int end)
        // Syntax: public String substring(int start)
        // Output: Xr
        // Output: XroW

        // 23. toString()
        String str = sb.toString();
        System.out.println("23. toString(): " + str);
        // Syntax: public String toString()
        // Output: dXroW

        // 24. trimToSize()
        sb.trimToSize();
        System.out.println("24. Capacity after trimToSize: " + sb.capacity());
        // Syntax: public void trimToSize()
        // Output: 21 (or the current capacity, might not change visibly)
    }
}

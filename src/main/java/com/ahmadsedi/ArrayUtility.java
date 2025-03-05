package com.ahmadsedi;

import java.util.Arrays;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 05/03/2025
 * Time: 20:02
 */

public class ArrayUtility {

    /**
     * @param input is an unordered array of Strings.
     * @return a distinct version of input which is sorted by frequency.
     */
    public static String[] sortByFrequencyAndDistinct(String[] input){
        return Arrays.stream(input).map(Element::new).map(e -> Arrays.stream(input).filter(s->e.getStr().equals(s)).map(Element::new).reduce(Element::reduce).get()).sorted().map(Element::getStr).distinct().toArray(String[]::new);
    }

    /**
     * {@code Element} class is an immutable class which represents each element of the array with its frequency.
     */
    static class Element implements Comparable<Element>{
        private String str;
        private int number;

        public Element(String str) {
            this.str = str;
            this.number = 1;
        }

        public Element(String str, int number) {
            this.str = str;
            this.number = number;
        }

        public static Element reduce(Element e1, Element e2){
            return new Element(e1.getStr(), e1.getNumber()+e2.getNumber());
        }

        public String getStr() {
            return str;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public int compareTo(Element e) {
            return this.number-e.number;
        }
    }
}

package com.ahmadsedi;

import java.util.Arrays;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 05/03/2025
 * Time: 20:02
 */

public class ArrayUtility {

    public static String[] sortByFrequencyAndDistinct(String[] array){
        return Arrays.stream(array).map(Element::new).map(e -> Arrays.stream(array).filter(s->e.getStr().equals(s)).map(Element::new).reduce(Element::reduce).get()).sorted().map(Element::getStr).distinct().toArray(String[]::new);
    }

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

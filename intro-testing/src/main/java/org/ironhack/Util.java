package org.ironhack;

import java.util.Set;

public class Util {

    private static final Set<String> KEYWORDS = Set.of(
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
    );



    public int[] checkingOdds(int n){
        if (n <= 0) {
            return new int[0];
        }
        int size = (n + 1) / 2;
        int k=0;
        int[] arr = new int[size];
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                arr[k] = i;
                k++;
            }
        }
        return arr;
    }
    public boolean checkingVariable(String variable) {
        if(variable==null || variable.trim().isEmpty()){
            return false;
        }
        String [] arr = variable.split(" ");
        for (String word : arr) {
            if (KEYWORDS.contains(word)) {
                return true;
            }
        }
        return false;

    }
}

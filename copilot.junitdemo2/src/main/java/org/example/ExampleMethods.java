package org.example;

public class ExampleMethods {

    // method to check whether given list is sublist of another list
public static boolean isSublist(int[] list, int[] sublist) {
        // if sublist is empty, return true
        if (sublist.length == 0) {
            return true;
        }
        // if list is empty, return false
        if (list.length == 0) {
            return false;
        }
        // iterate over list
        for (int i = 0; i < list.length; i++) {
            // if sublist is longer than list, return false
            if (i + sublist.length > list.length) {
                return false;
            }
            // iterate over sublist
            for (int j = 0; j < sublist.length; j++) {
                // if elements are not equal, break
                if (list[i + j] != sublist[j]) {
                    break;
                }
                // if sublist is over, return true
                if (j == sublist.length - 1) {
                    return true;
                }
            }
        }
        // if sublist is not found, return false
        return false;
    }

    //Test that method correctly concatenates two strings

    public static String concat(String a, String b) {
        return a + b;
    }

}

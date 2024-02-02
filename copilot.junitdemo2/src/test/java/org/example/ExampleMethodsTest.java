package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ExampleMethodsTest {

        @org.junit.jupiter.api.Test
        void isSublist() {
            //test case 1
            int[] list = {1, 2, 3, 4, 5};
            int[] sublist = {3, 4};
            assertTrue(ExampleMethods.isSublist(list, sublist));

            //test case 2
            int[] list2 = {1, 2, 3, 4, 5};
            int[] sublist2 = {3, 5};
            assertFalse(ExampleMethods.isSublist(list2, sublist2));

        }


        @org.junit.jupiter.api.Test
        void concat() {
            //test case 1
            String a = "Hello";
            String b = "World";
            assertEquals("HelloWorld", ExampleMethods.concat(a, b));

            //test case 2
            String a2 = "Hello";
            String b2 = "All";
            assertNotEquals("HelloAll", ExampleMethods.concat(a2, b2));
        }

}
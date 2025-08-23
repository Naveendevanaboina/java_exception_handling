package com.neoteric.exception;

public class ExceptionTest {

    public static void main(String[] args) {


        AService a =  new AService();
        a.a(18);
        //System.out.println("Hello 1");
//        System.out.println("Hello 2");
        //int i = 0;
//            int value = 2 / 0;
//            System.out.println("Hello 3");
//            System.out.println("Hello 4");
//            System.out.println("Hello 5");
//        }
//    }
//}
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        try {
            int i = 0;
            int value = 2 / 0;
        } catch (Exception e) {
            System.out.println("Exception error:" + e.getMessage());
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 5");
        }
    }
}

package com.seal;
import java.util.Scanner;
public class switchcase{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the week: ");
        int weeknum = in.nextInt();
//        switch (weeknum) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Choose a valid day!");
//        }
//        switch (weeknum) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Choose a valid day!");
//        }
//        if (weeknum == 1) {
//            System.out.println("Monday");
//        } else if (weeknum == 2) {
//            System.out.println("Tuesday");
//        } else if (weeknum == 3) {
//            System.out.println("Wednesday");
//        } else if (weeknum == 4) {
//            System.out.println("Thursday");
//        } else if (weeknum == 5) {
//            System.out.println("Friday");
//        } else if (weeknum == 6) {
//            System.out.println("Saturday");
//        } else if (weeknum == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Choose a valid day!");
//        }
//        switch(weeknum) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Choose a valid day!");
//        }
//        switch (weeknum) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("Choose a valid day!");
//        }
//        if (weeknum == 1 || weeknum == 2 || weeknum == 3 || weeknum == 4 || weeknum == 5) {
//            System.out.println("Weekday");
//        } else if (weeknum == 6 || weeknum == 7) {
//            System.out.println("Weekend");
//        } else {
//            System.out.println("Choose a valid day!");
//        }
        switch(weeknum) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                switch(weeknum) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                }
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                switch(weeknum) {
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                break;
            default:
                System.out.println("Choose a valid day!");
        }
        switch (weeknum) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Weekday");
                switch (weeknum) {
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                }
            }
            case 6, 7 -> {
                System.out.println("Weekend");
                switch (weeknum) {
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                }
            }
            default -> System.out.println("Choose a valid day!");
        }
        if (weeknum == 1 || weeknum == 2 || weeknum == 3 || weeknum == 4 || weeknum == 5) {
            System.out.println("Weekday");
            if (weeknum == 1) {
                System.out.println("Monday");
            } else if (weeknum == 2) {
                System.out.println("Tuesday");
            } else if (weeknum == 3) {
                System.out.println("Wednesday");
            } else if (weeknum == 4) {
                System.out.println("Thursday");
            } else if (weeknum == 5) {
                System.out.println("Friday");
            }
        } else if (weeknum == 6 || weeknum == 7) {
            System.out.println("Weekend");
            if (weeknum == 6) {
                System.out.println("Saturday");
            } else if (weeknum == 7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Choose a valid day!");
        }
    }
}
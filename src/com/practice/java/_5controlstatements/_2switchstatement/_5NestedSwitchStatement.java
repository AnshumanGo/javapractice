package com.practice.java._5controlstatements._2switchstatement;

public class _5NestedSwitchStatement {

    public static void main(String[] args) {

        String branch = "s";
        int classStandardYear = 9;
        switch (classStandardYear) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("english, hindi, science, mathematics, sst");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("english, hindi, science, mathematics, sst, sanskrit");
                break;

            case 9:
            case 10:
                switch (branch) {

                    case "s":
                        System.out.println("english, science, mathematics, sst, sanskrit");
                        break;
                    case "h":
                        System.out.println("english, hindi, science, mathematics, sst");
                        break;

                    default:
                        System.out.println("Subject combination not listed");
                }
                break;

            case 11:
            case 12:
                switch (branch) {
                    case "m":
                        System.out.println("physics, chemistry, mathematics, english, hindi");
                        break;
                    case "mb":
                        System.out.println("physics, chemistry, mathematics, english, biology");
                        break;
                    case "comm":
                        System.out.println("physics, chemistry, mathematics, english, computer");
                        break;

                    default:
                        System.out.println("Subject combination not listed");
                }
                break;
            default:
                System.out.println("Subject combination not listed");
        }
    }
}
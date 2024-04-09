package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final String RUSSIA = "Россия";
        final String ITALY = "Италия";
        final String ENGLAND = "Англия";
        final String GERMAN = "Германия";
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        while(!city.equals("Stop")){
            switch (city){
                case "Москва":
                    System.out.println(RUSSIA);
                    break;
                case "Владивосток":
                    System.out.println(RUSSIA);
                    break;
                case "Ростов":
                    System.out.println(RUSSIA);
                    break;
                case "Рим":
                    System.out.println(ITALY);
                    break;
                case "Турин":
                    System.out.println(ITALY);
                    break;
                case "Милан":
                    System.out.println(ITALY);
                    break;
                case "Ливерпуль":
                    System.out.println(ENGLAND);
                    break;
                case "Манчерстер":
                    System.out.println(ENGLAND);
                    break;
                case "Лондон":
                    System.out.println(ENGLAND);
                    break;
                case "Мюнхен":
                    System.out.println(GERMAN);
                    break;
                case "Берлин":
                    System.out.println(GERMAN);
                    break;
                case "Кельн":
                    System.out.println(GERMAN);
                    break;
                default:
                    System.out.println("Неизветстная страна");
                    break;

            }
            city = scanner.nextLine();
        }
    }
}
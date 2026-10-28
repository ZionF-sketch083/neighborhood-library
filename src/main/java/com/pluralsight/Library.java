package com.pluralsight;

import java.util.Scanner;

public class Library {
    private static final Book[] books = new Book[20];

    private static int bigBooks = 20;

    public static void main(String[] args) {
        books[0] = new Book(62387, "978-0-377-65732-9", "How to touch grass", true, "East Atlanta Library");
        books[1] = new Book(50999, "978-1-338-73999-2", "Five Nights at Freddy's: Fazbear Frights #9: The Puppet Carver", false, "Zion's Library");
        books[2] = new Book(51699, "978-1-302-91176-8", "Venom: Lethal Protector", false, "Marvel Store");
        books[3] = new Book(51799, "978-1-302-91306-9", "Venom: King in Black", false, "Marvel Store");
        books[4] = new Book(52999, "978-1-338-13437-7", "Five Nights at Freddy's: The Silver Eyes", false, "Zion's Library");
        books[5] = new Book(98327, "978-1-094-63450-4", "Trouble in Zombie-Town", true, "Druid Hill Middle School's Library");
        books[6] = new Book(51899, "978-0-679-78001-4", "Random House: Japanese-English/English-Japanese Dictionary", false, "Amazon Library");
        books[7] = new Book(87872, "978-0-827-86379-5", "Godzilla: Ruler of Earth", false, "Godzilla Store");
        books[8] = new Book(32787, "979-0-286-87378-6", "Godzilla In Hell", false, "Godzilla Store");
        books[9] = new Book(65765, "978-1-786-92678-3", "Elden Ring: Books of Knowledge", false, "Bandai Namco Store");
        books[10] = new Book(29876, "979-1-783-72986-7", "Abyssal Archive: The Mythology Of Dark Souls", false, "Amazon Library");
        books[11] = new Book(27676, "978-0-872-62386-8", "Godzilla Minus One - The Novelization", false, "Godzilla Store");
        books[12] = new Book(26987, "978-0-173-63257-2", "Sweet Potato", true, "The Liberry");
        books[13] = new Book(32788, "979-0-287-62187-5", "The story of Picking the fries in the Bag", false, "The Liberry");
        books[14] = new Book(73298, "979-0-328-73488-3", "Daily Potato", true, "The Church of Potatos");
        books[15] = new Book(32768, "978-0-634-67368-1", "Tomorrow's Teachings of Potato", false, "Google Books");
        books[16] = new Book(28767, "978-0-878-67577-3", "Potato Sensei's Path to Success Guide", true, "Potato's Gift Shop");
        books[17] = new Book(36879, "978-1-872-87628-8", "Avengers: Rage of Ultron", true, "Marvel Store");
        books[18] = new Book(93208, "979-1-894-10874-9", "Thor: God of Thunder", true, "Marvel Store");
        books[19] = new Book(32689, "978-0-398-86376-6", "Age of Ultron", true, "Marvel Store");

        Scanner scanner = new Scanner(System.in);

        boolean isCheck = false;

        while (!isCheck){
            System.out.println("What would you want to see?");
            System.out.println("1 - Show the Available Books");
            System.out.println("2 - Show the Check Out Books");
            System.out.println("3 - Exit");
            System.out.println("Enter your command: ");

            int command = scanner.nextInt();

            switch (command){
                case 1:
                    listAvailableBooks();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }

        }
    }

    public static void listAvailableBooks(){
        System.out.println("Available Books: ");

        for (int i = 0; i < bigBooks; i++) {
            System.out.println(books[i]);
        }

    }
}



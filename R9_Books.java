import java.util.Scanner;

class Publisher {
    String pub_name;
    int yr_pub;

    Publisher(String pname, int pyr) {
        pub_name = pname;
        yr_pub = pyr;
    }
}

class Book extends Publisher {
    String book_name, author;
    int cost;

    Book(String pname, int pyr, String bname, String author, int cost) {
        super(pname, pyr);
        this.book_name = bname;
        this.author = author;
        this.cost = cost;
    }
}

class Literature extends Book {
    String genre;

    Literature(String pname, int pyr, String bname, String author, int cost, String genre) {
        super(pname, pyr, bname, author, cost);
        this.genre = genre;
    }

    void display() {
        System.out.println("Name of book: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Publisher: " + pub_name);
        System.out.println("Year Published: " + yr_pub);
        System.out.println("Cost: " + cost);
    }
}

class Fiction extends Book {
    String genre;

    Fiction(String pname, int pyr, String bname, String author, int cost, String genre) {
        super(pname, pyr, bname, author, cost);
        this.genre = genre;
    }

    void display() {
        System.out.println("Name of book: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Publisher: " + pub_name);
        System.out.println("Year Published: " + yr_pub);
        System.out.println("Cost: " + cost);
    }
}

public class Books {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Literature");
            System.out.println("2. Fiction");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine(); 

            if (option == 3) {
                System.out.println("Exiting...");
                break;
            }

            String bname, author, genre, pname;
            int pyr, cost;

            switch (option) {
                case 1:
                    System.out.println("Enter Literature details:::::::::");
                    System.out.print("Enter name of the book: ");
                    bname = sc.nextLine();
                    System.out.print("Enter name of author: ");
                    author = sc.nextLine();
                    System.out.print("Enter book genre: ");
                    genre = sc.nextLine();
                    System.out.print("Enter name of publisher: ");
                    pname = sc.nextLine();
                    System.out.print("Enter year published: ");
                    pyr = sc.nextInt();
                    System.out.print("Enter the cost: ");
                    cost = sc.nextInt();
                    sc.nextLine(); 

                    Literature lit = new Literature(pname, pyr, bname, author, cost, genre);
                    System.out.println("\nLiterature Book Details:");
                    lit.display();
                    break;

                case 2:
                    System.out.println("Enter Fiction details:::::::::");
                    System.out.print("Enter name of the book: ");
                    bname = sc.nextLine();
                    System.out.print("Enter name of author: ");
                    author = sc.nextLine();
                    System.out.print("Enter book genre: ");
                    genre = sc.nextLine();
                    System.out.print("Enter name of publisher: ");
                    pname = sc.nextLine();
                    System.out.print("Enter year published: ");
                    pyr = sc.nextInt();
                    System.out.print("Enter the cost: ");
                    cost = sc.nextInt();
                    sc.nextLine(); 

                    Fiction fic = new Fiction(pname, pyr, bname, author, cost, genre);
                    System.out.println("\nFiction Book Details:");
                    fic.display();
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}

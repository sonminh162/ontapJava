import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("Menu\n");
        System.out.print("1.Insert new\n");
        System.out.print("2.View list news\n");
        System.out.print("3.Average rate\n");
        System.out.print("4.Exit\n");
        System.out.print("nhap vao lua chon cua ban:");
        choice = scanner.nextInt();
        ArrayList<News> newsList = new ArrayList<>();
        switch(choice){
            case 1:
                System.out.println("title:");
                String title = scanner.nextLine();
                scanner.close();
                System.out.println("publish date:");
                String publishDate = scanner.nextLine();
                scanner.close();
                System.out.println("author:");
                String author = scanner.nextLine();
                scanner.close();
                System.out.println("content:");
                String content = scanner.nextLine();
                scanner.close();
                News news = new News(title,publishDate,author,content);
                System.out.println("Nhap 3 danh gia:");
                News.rateList[0] = scanner.nextInt();
                News.rateList[1] = scanner.nextInt();
                News.rateList[2] = scanner.nextInt();
                newsList.add(news);
                break;
            case 2:
                for(News newsItem : newsList){
                    newsItem.display();
                }
                break;
            case 3:
                for(News newsItem : newsList){
                    newsItem.calculate();
                    newsItem.display();
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("no choice!");
        }

    }
}
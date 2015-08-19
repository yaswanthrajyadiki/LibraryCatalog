/**
 * Write a description of class Menu here.
 * @author (yaswanth)
 * @version (12-08-2015)
 */
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Card c1 = new Card("LetUsC" , "Kanetkar" , "Intro to C");
        CardCatalog cc1 = new CardCatalog(10);
        Card c2 = new Card("ThinkJava" , "AllenB.Downey" , "Intro to C");
        Card c3 = new Card("ATwoStates" , "Chetan" , "Lovestory");
        Card c4 = new Card("LetUsC++" , "Kanetkar" , "Intro to C++"); 
        cc1.addACard(c1);
        cc1.addACard(c2);
        cc1.addACard(c3);
        cc1.addACard(c4);
        cc1.removeATitle("ATwoStates");
        cc1.printTheCatalog();
        Card c = cc1.getATitle("LetUsC");
        System.out.print("Title: "+c.getTitleOfBook()+", ");
        System.out.print("Author: "+c.getAuthorOfBook()+", ");
        System.out.println("Subject: "+c.getSubject());
        //Card[] ca = cc1.getAnAuthor("Kanetkar");
        Card[] ca1 = cc1.getAnAuthor("AllenB.Downey");
        for(int i=0; ca1[i]!=null; i++) {
            System.out.print("Title: "+ca1[i].getTitleOfBook()+", ");
            System.out.print("Author: "+ca1[i].getAuthorOfBook()+", ");
            System.out.println("Subject: "+ca1[i].getSubject());
        }
        Card[] cs = cc1.getSubject("Intro to C");
        for(int i=0; cs[i]!=null; i++) {
            System.out.print("Title: "+cs[i].getTitleOfBook()+", ");
            System.out.print("Author: "+cs[i].getAuthorOfBook()+", ");
            System.out.println("Subject: "+cs[i].getSubject());
        }
    }
}

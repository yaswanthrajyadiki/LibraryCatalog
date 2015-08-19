/**
 * Write a description of class CardCatalog here.
 * @author (Yaswanth)
 * @version (11-08-2015)
 */
public class CardCatalog {
/**
* Index of arrays.
*/
  private int index;
/**
* flag is used in insertion of cards.
*/
  private int flag = 0;
/**
 * size is used in the getauthor method.
 */
  private int size;
/**
 * Title cards array for titlearray.
 */
  private Card[] titleCards;
/**
 * Author cards array for authorarray.
 */
  private Card[] authorCards;
/**
 * Subject cards array for sbject array.
 */
  private Card[] subjectCards;
/**
* Constructor for CardCatalog.
* @param siz is array size of cards
*/
  CardCatalog(final int siz) {
    index = 0;
    //this.size = siz;
    titleCards = new Card[size];
    authorCards = new Card[size];
    subjectCards = new Card[size];
  }
/**
* addACard method is intialised to pass cards into card array.
* @param card object of card
*/
  final void addACard(final Card card) {
    if (index == 0) {
      titleCards[index] = card;
      authorCards[index] = card;
      subjectCards[index] = card;
    } else {
      for (int i = 0; i < index; i++) {
        flag = 0;
        if (card.getTitleOfBook().compareTo(titleCards[i].getTitleOfBook()) < 0) {
          flag = 1;
          for (int j = index; j > i; j--) {
            titleCards[j] = titleCards[j - 1];
          }
          titleCards[i] = card;
          break;
        }
      }
      if (flag == 0) {
        titleCards[index] = card;
      }
      for (int i = 0; i < index; i++) {
        flag = 0;
        if (card.getAuthorOfBook().compareTo(authorCards[i].getAuthorOfBook()) < 0) {
          flag = 1;
          for (int j = index; j > i; j--) {
            authorCards[j] = authorCards[ j - 1];
          }
          authorCards[i] = card;
          break;
        }
      }
      if (flag == 0) {
        authorCards[index] = card;
      }
      for (int i = 0; i < index; i++) {
        flag = 0;
        if (card.getSubject().compareTo(subjectCards[i].getSubject()) < 0) {
          flag = 1;
          for (int j = index; j > i; j--) {
            subjectCards[j] = subjectCards[j - 1];
          }
          subjectCards[i] = card;
          break;
        }
      }
      if (flag == 0) {
        subjectCards[index] = card;
      }
    }
    index++;
  }
/**
* Remove a title.
* @param title using title of book
*/
  final void removeATitle(final String title) {
    for (int i = 0; i < index; i++) {
      if (title.compareTo(titleCards[i].getTitleOfBook()) == 0) {
        for (int ind = i; ind < index - 1; ind++) {
          titleCards[ind] = titleCards[ind + 1];
        }
      }
    }
    for (int i = 0; i < index; i++) {
      if (title.compareTo(authorCards[i].getTitleOfBook()) == 0) {
        for (int ind = i; ind < index - 1; ind++) {
          authorCards[ind] = authorCards[ind + 1];
        }
      }
    }
    for (int i = 0; i < index; i++) {
      if (title.compareTo(subjectCards[i].getTitleOfBook()) == 0) {
        for (int ind = i; ind < index - 1; ind++) {
          subjectCards[ind] = subjectCards[ind + 1];
        }
      }
    }
    index--;
  }
/**
* Searching first book using title.
* @param titleOfBook using title of Book
* @return first card which has title parameter
*/
  final Card getATitle(final String titleOfBook) {
    System.out.println("-----Get title of Book-----");
    for (int i = 0; i < index; i++) {
      if (titleOfBook.compareTo(titleCards[i].getTitleOfBook()) == 0) {
        return titleCards[i];
      }
    }
    return null;
  }
/**
* Searching books using authorname.
* @param authorOfBook using author of Book
* @return authorCards array which has parmetre author
*/
  final Card[] getAnAuthor(final String authorOfBook) {
    System.out.println("-----Get author books-----");
    Card[] author = new Card[size];
    for (int i = 0, k = 0; i < index; i++) {
      if (authorOfBook.compareTo(authorCards[i].getAuthorOfBook()) == 0) {
        author[k] = authorCards[i];
        k++;
      }
    }
    return author;
  }
/**
* Searching book using subject getting all the books related to subject.
* @param subjectOfBook which is passed
* @return subjectArray which has parametre subject
*/
  final Card[] getSubject(final String subjectOfBook) {
    System.out.println("-----Get subject books-----");
    Card[] subject = new Card[size];
    for (int i = 0, l = 0; i < index; i++) {
      if (subjectOfBook.compareTo(subjectCards[i].getSubject()) == 0) {
        subject[l] = subjectCards[i];
        l++;
      }
    }
    return subject;
  }
/**
 * Printing all books in sorting order.
 */
  final void printTheCatalog() {
  //printing according to title
    for (int i = 0; i < index; i++) {
      System.out.println("---Sort by Title---");
      for (i = 0; i < index; i++) {
        System.out.print("Title:" + titleCards[i].getTitleOfBook() + " ");
        System.out.print("Author:" + titleCards[i].getAuthorOfBook() + " ");
        System.out.println("Subject:" + titleCards[i].getSubject());
      }
      System.out.println("---Sort by Author---");
      for (i = 0; i < index; i++) {
        System.out.print("Title:" + authorCards[i].getTitleOfBook() + " ");
        System.out.print("Author:" + authorCards[i].getAuthorOfBook() + " ");
        System.out.println("Subject:" + authorCards[i].getSubject());
      }
      System.out.println("---Sort by Subject---");
      for (i = 0; i < index; i++) {
        System.out.print("Title:" + subjectCards[i].getTitleOfBook() + " ");
        System.out.print("Author:" + subjectCards[i].getAuthorOfBook() + " ");
        System.out.println("Subject:" + subjectCards[i].getSubject());
      }
    }
  }
}

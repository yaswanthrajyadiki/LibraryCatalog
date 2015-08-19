/**
 * Write a description of class Card here.
 * @author (Yaswanth)
 * @version (11-08-2015)
 */
  public class Card {
/**
 * titleOfBook in card catalog.
 */
  private String titleOfBook;
/**
 * authorOfBook in card catalog.
 */
  private String authorOfBook;
/**
 * subjectOfBook in card catalog.
 */
  private String subjectOfBook;
/**
 * Constructor for card class.
 * @param titleOfBook1 gets from the menu class
 * @param authorOfBook1 gets from the menu class
 * @param subjectOfBook1 gets from the menu class
 */
  Card(final String titleOfBook1,
  final String authorOfBook1, final String subjectOfBook1) {
    this.titleOfBook = titleOfBook1;
    this.authorOfBook = authorOfBook1;
    this.subjectOfBook = subjectOfBook1;
  }
/**
* gerTitleOfBook method.
* @return titleOfBook of card catalog
*/
  final String getTitleOfBook() {
    return this.titleOfBook;
  }
/**
 * getAuthorOfBook method.
 * @return authorOfBook of card Catalog
 */
  final String getAuthorOfBook() {
    return this.authorOfBook;
  }
/**
 * getSubjectOfBook method.
 * @return subjectOfBook of card catalog
 */
  final String getSubject() {
    return this.subjectOfBook;
  }
  }

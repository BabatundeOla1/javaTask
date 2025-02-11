package bookShopping;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class BookTest {

     @Test
     public void testThatExceptionIsThrownWhenUserInputBlankBookTitle(){
         assertThrows(IllegalArgumentException.class, () -> new Book("   ", "babatunde", 2000));

         Book book = new Book("title", "babatunde", 20000);
         assertThrows(IllegalArgumentException.class, ()-> book.setTitle("   "));
     }
     @Test
     public void testThatExceptionIsThrownWhenUserInputInvalidBookTitle(){
         assertThrows(IllegalArgumentException.class, () -> new Book("4567tryghj", "babatunde", 2000));

         Book book = new Book("title", "babatunde", 20000);
         assertThrows(IllegalArgumentException.class, ()-> book.setTitle("213742hfdfd"));
     }
     @Test
     public void testThatExceptionIsThrownWhenUserInputInvalidAuthors_Name(){
         assertThrows(IllegalArgumentException.class, () -> new Book("title", "2345sdfgh", 2000));

         Book book = new Book("title", "babatunde", 20000);
         assertThrows(IllegalArgumentException.class, ()-> book.setAuthorName("213742hfdfd"));
     }

     @Test
     public void testThatExceptionIsThrownWhenUserInputBlankAuthors_Name(){
         assertThrows(IllegalArgumentException.class, () -> new Book("title", "   ", 2000));

         Book book = new Book("title", "babatunde", 20000);
         assertThrows(IllegalArgumentException.class, ()-> book.setAuthorName("   "));
     }

     @Test
     public void testThatErrorIsThrownWhenUserInputInvalidPrice(){
         assertThrows(IllegalArgumentException.class, () -> new Book("title", "babatunde",  -2000));

         Book book = new Book("title", "babatunde", 20000);
         assertThrows(IllegalArgumentException.class, ()-> book.setPrice(-20000));
     }
}
import org.example.MyLimitedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JUnit {
    @Test
     public void tryAdd(){
         MyLimitedList <Integer>  lis1 = new MyLimitedList<>(3);
         lis1.addItem(3);
        int expected = 3;
        int actual = lis1.getItem(0);
        Assertions.assertEquals(expected, actual);
        }
        @Test
    public void tryRemove(){
        MyLimitedList <Integer>  lis1 = new MyLimitedList<>(3);
        lis1.addItem(56);lis1.addItem(18);lis1.addItem(05);
        lis1.removeItem();
        int expected = 2;
        int actual = lis1.size();
        Assertions.assertEquals(expected, actual);
    }
}

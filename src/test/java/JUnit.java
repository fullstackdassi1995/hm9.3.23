import org.example.MyLimitedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JUnit {
    @Test
        void tryAdd(){
         MyLimitedList <Integer>  lis1 = new MyLimitedList(3);
         lis1.addItem((Integer)3);
//       ArrayList<Integer> expected = new ArrayList<>();
//       expected.add(3);
        int expected = 3;
        int actual = lis1.getItem(0);
        Assertions.assertEquals(expected, actual);

    }
}

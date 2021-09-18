package List;

import java.security.PublicKey;
import java.util.*;

public class MultipleOfFive
{
    List<Integer> list=new ArrayList<Integer>();
    public void ListPrint()
    {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        for (var item: list)
        {
            System.out.println("9 X " + item + "= " +9*item );
        }
    }

    public static void main(String[] args)
    {
        MultipleOfFive l = new MultipleOfFive();
        l.ListPrint();
    }
}

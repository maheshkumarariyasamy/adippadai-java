package naal.erandu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListUtils {

    List<Integer> developerId = new ArrayList<Integer>();

    void addDeveloperId(int count) {
        int initialId = 1000;

        for (int index = 0; index < count; index++) {
            developerId.add(initialId+index);
        }
    }

    void listIteration()
    {
        Iterator<Integer> it = developerId.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        ArrayListUtils listUtils = new ArrayListUtils();
        listUtils.addDeveloperId(5);
        listUtils.listIteration();
        listUtils.developerId.set(4,1005);

        //After Update index value
        listUtils.listIteration();
    }
}
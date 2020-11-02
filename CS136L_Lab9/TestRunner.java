import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.linkedlist.DoublyLinkedListTest;

public class TestRunner
{

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(DoublyLinkedListTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            if(!(failure.getException() instanceof AssertionError))
            {
                System.out.println("\tException Thrown: " + failure.getException());
            }
            // Uncomment the next line if you need more information on on the failures.
            //System.out.println(failure.getTrace());
        }
    }
}

package RecapJava;

public class GarbageCollector {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-what is garbage collector and where it is coming from?

     -->It is a way of cleaning unused or useless data in the class from memory
     -->It is coming from System. (System.gc())

    2-How can you prove that gc is working? (OCA EXAM)

      -->We override finalize method from Java

    3-Do you have to call GC o clean up your useless/unused codes?

      no, because it is automatically/default working all the time in System.


     */

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

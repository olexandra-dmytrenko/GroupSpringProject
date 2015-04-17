import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;

import java.util.Date;

/**
 * Created by sergii on 02.04.15.
 */
public class Main {
    public static void main(String[] args) {


        DateTime lastUpdateDate = DateTime.now();
        DateTime now = new DateTime();


        System.out.println("LastUpdate: " + lastUpdateDate);
        System.out.println("Now: " + now);
        boolean isRun = isRunDateLessThenLastUpdateDate(lastUpdateDate, now);

        System.out.println("IS RUN = " + isRun);

        String s = "s" + null;

        System.out.println(s);



        int a = 25 * 10
                ;
        int b = 230;
        int x = (a / b);
        System.out.println(x);


    }


    public static boolean isRunDateLessThenLastUpdateDate(DateTime lastUD, DateTime runDT){
        int value  = DateTimeComparator.getDateOnlyInstance().compare(lastUD, runDT);
        System.out.println(value);
        return value > 0;

    }


}

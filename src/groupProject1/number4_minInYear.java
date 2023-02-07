package GroupProject1;

public class number4_minInYear {
    public static void main(String[] args) {

        int minutes = 3456789;       // INPUT
        int minInYear = 365*24*60, minInDay = 24*60;   // 525600 mins in a year , 1440 mins in a day
        int numberYear = minutes / minInYear;    // we divide input of min on total amount of min in a year and we gonna have total years amount
        int leftover = minutes % minInYear;     // we find whats left after we get we get 6 yeards
        int days = leftover / minInDay;         // this leftover we devide by minInday to find how many days

        System.out.println("In " + minutes + " minutes is approximately " + numberYear+ " years " + "and  " + days + " days");   // number of years

    }
}

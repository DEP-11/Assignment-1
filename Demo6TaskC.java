public class Demo6TaskC {
    
    public static void main(String[] args) {

        String city1 = " Los Angeles";
        String state1 = " California";
        int population1 = 3966936;

        String city2 = " York";
        int population2 = 8336817;

        final String BOLT = "\033[37;1m";
        final String RE = "\033[0m";
        final String LINE ="\033[38;5;172m";
        final String NUM ="\033[38;5;216m";
        final String GREEN ="\033[38;5;2m";

        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"---------------","------------","------------");
        System.out.printf("|%s%3$-15s%2$s%6$s|%2$s%1$s%4$-12s%2$s%6$s|%2$s%1$s%5$-12s%2$s%6$s|\n",BOLT,RE," CITY"," STATE"," POPULATION",LINE);
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"---------------","------------","------------");
        System.out.printf("|%4$s%1$-15s%5$s|%4$s%2$-12s%5$s|%4$s%3$,11d %5$s|\n",city1,state1,population1,RE,LINE,NUM);
        System.out.printf("|%4$s%7$s%3$s%4$s%1$-11s%5$s|%4$s%7$s%3$s%4$s%1$-8s%5$s|%4$s%2$,11d %5$s|\n",city2,population2," New",RE,LINE,NUM,GREEN);
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"---------------","------------","------------");


        

        


    }
}

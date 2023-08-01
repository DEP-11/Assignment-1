public class Demo6TaskB {
    public static void main(String[] args) {
        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        final String BLUE = "\033[34;1m";
        final String RE = "\033[0m";
        final String LINE ="\033[38;5;166m";
        final String NUM ="\033[38;5;216m";


        System.out.printf("%s+%10s+%5s+\n",LINE,"----------","-----");
        System.out.printf("|%s%3$-10s%5$s%2$s%5$s|%1$s%4$-5s%5$s%2$s%5$s|\n",BLUE,RE,"NAME"," AGE",LINE);
        System.out.printf("%4$s%1$s+%2$10s+%3$5s+\n",LINE,"----------","-----",RE);
        System.out.printf("|%3$s%-10s%4$s|%3$s%5$s% 4d%4$s |\n",name1,age1,RE,LINE,NUM);
        System.out.printf("|%3$s%-10s%4$s|%3$s%5$s% 4d%4$s |\n",name2,age2,RE,LINE,NUM);
        System.out.printf("%s+%10s+%5s+\n",LINE,"----------","-----");
    }
}

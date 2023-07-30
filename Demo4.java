public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        final String da = "\033[31m";
        final String mon = "\033[32m";
        final String yea = "\033[33m";
        final String hou = "\033[34m";
        final String min = "\033[35m";
        final String sec = "\033[36m";
        final String Res="\033[0m";

        System.out.printf("%s%d%s/%s%d%s/%s%d%s %s%d%s:%s%d%s:%s%d\n",da,day,Res,mon,month,Res,yea,year,Res,hou,hour,Res,min,minute,Res,sec,second);
    }
}

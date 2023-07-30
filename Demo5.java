public class Demo5 {
    public static void main(String[] args) {
        int one = 978;
        int two = 3;
        int three = 16;
        int four = 1484100;

        final String da = "\033[31m";
        final String mon = "\033[32m";
        final String yea = "\033[33m";
        final String hou = "\033[34m";
        final String Res="\033[0m";

        System.out.printf("%s%d%s-%s%d%s-%s%d%s-%s%d\n",da,one,Res,mon,two,Res,yea,three,Res,hou,four);
    }
}

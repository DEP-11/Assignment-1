public class Demo6TaskA{
    public static void main(String[] args) {
        String value ="0%";
        final String Rec = "\033[0m";
        final String RED ="\033[41m";
        final String GREEN  ="\033[42m";
        System.out.printf("%s[     5%s%s%s     ]%s\n",RED,Rec,GREEN,value,Rec);
        
    }
}
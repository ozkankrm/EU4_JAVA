package interview_Questions.CoreJava;

public class reverseNumber {

    public static void main(String[] args) {
        int i = 2345;

        System.out.println("method1(i) = " + method1(i)); //5432
        System.out.println("method2(i) = " + method2(i));
    }

    // 1. solution
    public static int method1(int number){

        int  reverse = 0;

        while(number!=0){ // (number>0 || number<0)-->bu da  olabilir
            int reminder = number%10; // enson sayiyi verir.
            reverse = reverse*10+reminder;
            number = number/10;
        }
        return reverse;
    }

    // 2.  solution
    public static int method2(int  data){

        String str = Integer.toString(data);// int degerini stringe donustu

        StringBuffer sbf  = new StringBuffer(str);
        sbf.reverse(); // stringi reverse  yapti

        int result = Integer.parseInt(sbf.toString()); // reverse olan stringi inte donusturdu

        return result;

    }



}



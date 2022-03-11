package bat.aaup;

public class Main {

    public static void main(String[] args) {


        int max;
        max = Integer.MIN_VALUE;

        int []a= {1,6,8,0,8};

        for (int i = 1; i < a.length; i++) {
            if (a[i]>max)max=a[i];
        }
        for (int i = 0; i < 100; i++) {
            System.out.println();

        }
        System.out.println(max);
        Batata batata=new Batata();




    }
    public static void haha(){

    }
    private static class Batata {

    }
}

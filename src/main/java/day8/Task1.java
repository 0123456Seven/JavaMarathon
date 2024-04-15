package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<=20000;i++){
            stringBuilder.append(i+" ");
        }
        long end = System.currentTimeMillis() - start;
        System.out.println(end);
        System.out.println();
        System.out.println();
        System.out.println();
        long start2 = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i<=20000;i++){
             str = str.concat(i+" ");
        }
        long end2 = System.currentTimeMillis() - start2;
        System.out.println(end2);
    }

}

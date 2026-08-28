public class TP3Ex4 {
    public static void main(String[] args) throws Exception{
        for(int i = 1; i <= 100; i ++){
            System.out.print(i);
            if (i < 100){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        for(int i = 50; i >= 10; i --){
            System.out.print(i);
            if (i > 10){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        for(int i = 3; i <= 300; i += 3){
            System.out.print(i);
            if (i < 300){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        for(int i = 1; i <= 200; i += 2){
            System.out.print(i);
            if (i < 199){
                System.out.print(", ");
            }
        }

    }

}

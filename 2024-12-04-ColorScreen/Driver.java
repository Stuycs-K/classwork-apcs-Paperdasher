public class Driver {

    public static void valcolor(int val){
        if (val < 25){
            Text.color(Text.RED + 60);
            System.out.print(val);
        }
        else if (val > 75){
            Text.color(Text.GREEN + 60);
            System.out.print(val);
        }
        else{
            Text.color(Text.WHITE);
            System.out.print(val);
        }
        Text.color(Text.WHITE);
    } 
    
    public static void main(String[] args){
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        Text.go(1,1);
        Text.color(Text.GREEN, Text.background(Text.MAGENTA));
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }

        for (int i = 1; i <= 30; i++){
            Text.go(1, i);
            System.out.print("-");
        }

        for (int i = 1; i <= 30; i++){
            Text.go(80, i);
            System.out.print("-");
        }

        for (int i = 1; i <= 80; i++){
            Text.go(i, 30);
            System.out.print("-");
        }

        System.out.print(Text.RESET);

        int[] randomarr = {(int)(Math.random() * 100) ,(int)(Math.random() * 100),(int)(Math.random() * 100)};

        for (int i = 0; i < randomarr.length; i++){
            Text.go((i + 1) * 20, 2);
            valcolor(randomarr[i]);
        }

        Text.color(Text.BLUE);
        for (int i = 2; i <= 79; i++){
            Text.go(i, 3);
            System.out.print("*");
        }
        

        Text.go(1, 31);
        System.out.println(Text.RESET);
    }
}

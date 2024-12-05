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
        
        System.out.print("\u001b[1;30m");
        Text.go(20, 5);
        System.out.print("\u001b[48;2;"+0+";"+255+";"+0+"m");
        System.out.println(".............         ............");
        Text.go(20, 6);
        System.out.print("\u001b[48;2;"+30+";"+255+";"+30+"m");
        System.out.println(".............         ............");
        Text.go(20, 7);
        System.out.print("\u001b[48;2;"+60+";"+255+";"+60+"m");
        System.out.println("......                ......      ");
        Text.go(20, 8);
        System.out.print("\u001b[48;2;"+90+";"+255+";"+90+"m");
        System.out.println(".....                 ......      ");
        Text.go(20, 9);
        System.out.print("\u001b[48;2;"+120+";"+255+";"+120+"m");
        System.out.println(".....                 ............");
        Text.go(20, 10);
        System.out.print("\u001b[48;2;"+150+";"+255+";"+150+"m");
        System.out.println(".....                 ............");
        Text.go(20, 11);
        System.out.print("\u001b[48;2;"+180+";"+255+";"+180+"m");
        System.out.println(".....                       ......");
        Text.go(20, 12);
        System.out.print("\u001b[48;2;"+210+";"+255+";"+210+"m");
        System.out.println("......                      ......");
        Text.go(20, 13);
        System.out.print("\u001b[48;2;"+240+";"+255+";"+240+"m");
        System.out.println(".............         ............");
        Text.go(20, 14);
        System.out.print("\u001b[48;2;"+255+";"+255+";"+255+"m");
        System.out.println(".............         ............");

        Text.go(1, 31);
        System.out.println(Text.RESET);
    }
}

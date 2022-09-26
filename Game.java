import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNum;
    private int nofG;
    public  Game(){

//        Random random=new Random();
//        randomNum = random.nextInt(50);
//        System.out.println(randomNum);
        randomNum=(int) (Math.random()*50);
    }

    public int getNofG() {
        return nofG;
    }

    public void setNofG(int nofG) {
        this.nofG = nofG;
    }

    public static void main(String[] args) {
        Game n = new Game();
        for (int j=1;j<=5;j++){
        System.out.println("Computer Generated:" + n.randomNum);
        Scanner s = new Scanner(System.in);
        System.out.print("User Input in range between 1 to 50 numbers :");
        int y=s.nextInt();
        if(y<=50) {
//             y = s.nextInt();
            System.out.println("User Input in range between 1 to 50 numbers :" + y + "\n");
        }
        else{
            System.out.println("Number is exceeded from range 50");
            }

        if (n.randomNum == y) {
            System.out.println("You Won!!");
            n.setNofG(j);
            System.out.println("No of Guesses : "+n.getNofG());
            switch (n.getNofG()){
                case 1:
                    System.out.println("Score = 100");
                    break;

                case 2:
                    System.out.println("Score = 80");
                    break;

                case 3:
                    System.out.println("Score = 60");
                    break;

                case 4:
                    System.out.println("Score = 40");
                    break;

                case 5:
                    System.out.println("Score = 20");
                    break;

                default:
                    System.out.println("Score = 0");
            }
            break;
        } else if (n.randomNum > y) {
            System.out.println("Input is less than Computer Generated Number\n");

        } else if (n.randomNum < y) {
            System.out.println("Input is greater than Computer Generated Number\n");

        }
//            else {
//            System.out.println("Oooops!! Something went wrong..");
//        }
            n.setNofG(j);

        if (n.getNofG()==5 && n.randomNum != y){
//            System.out.println("No of Guesses : "+n.getNofG());
            System.out.println("----------------------------------------------------");
            System.out.println("Score = 0\n");
            System.out.println("No of Guesses is exceeded -- You Lost!!");

            }
    }
    }
}

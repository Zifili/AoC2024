package Day_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class AoC2{
    static public void main(String args[]){
        File f = new File("./part1.txt");
        Scanner input;
        
        ArrayList<Integer> sx = new ArrayList<>();
        ArrayList<Integer> dx = new ArrayList<>();
        
        try {
            input = new Scanner(f);

            while(input.hasNext()){
                sx.add(input.nextInt());
                dx.add(input.nextInt());
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int counter = 0;
        int apparizioni = 0;
        for (int sinistra : sx) {
            counter = 0;
            for (int destra : dx) {
                if(sinistra == destra){
                    counter++;
                }
            }
            apparizioni += (sinistra * counter);
        }
        System.out.println(apparizioni);
    }
}
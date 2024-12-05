package Day_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class AoC1{
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
        int distanza = 0;
        sx.sort(Comparator.naturalOrder());
        dx.sort(Comparator.naturalOrder());
        for (int item = 0; item < sx.size();item++){
            int sinistra = sx.get(item);
            int destra = dx.get(item);
            distanza += Math.abs(sinistra-destra);
        }
        System.out.println(distanza);
    }
}
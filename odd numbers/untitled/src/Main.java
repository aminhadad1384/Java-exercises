import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<Integer>list = new LinkedList<>();
        for(int a0 = 0; a0 < size; a0++){
            list.add(sc.nextInt());
        }
        int target=sc.nextInt();
        for(int a1 = 0; a1 < list.size(); a1++) {
            int node = list.get(a1);
            if(node < target) {
                int i;
                for(i= 0; list.get(i)<target; i++) {
                }
                list.add(i,node);
                list.remove(a1+1);
            }
        }
        while(size > 0){
            System.out.print(list.pop()+" ");
            size--;
        }
    }
}
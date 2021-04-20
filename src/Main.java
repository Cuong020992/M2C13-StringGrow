import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi kí tự: ");
        String input = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for(int i = 0;i<input.length();i++){
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(input.charAt(i));
            for (int j = i+1;j<input.length();j++){
                if(input.charAt(j)>temp.getLast()){
                    temp.add(input.charAt(j));
                }
            }
            if(temp.size() > max.size()){
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }
        for(Character list : max){
            System.out.print(list);
        }
    }
}

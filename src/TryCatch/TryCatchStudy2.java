package TryCatch;

import java.util.Scanner;

public class TryCatchStudy2 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (true) {
            try {
                // 사용자 입력을 받아 배열에 저장
                names[i] = scan.nextLine();                

                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // 인덱스 범위를 초과하면 루프를 종료
                break;
            }
            System.out.println(names[i]);
        }
    }
}

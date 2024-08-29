package TryCatch;

import java.util.Scanner;

public class TryCatchStudy2 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (true) {
            try {
                // ����� �Է��� �޾� �迭�� ����
                names[i] = scan.nextLine();                

                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // �ε��� ������ �ʰ��ϸ� ������ ����
                break;
            }
            System.out.println(names[i]);
        }
    }
}

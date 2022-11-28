import java.util.Arrays;
import java.util.Scanner;

public class homeWork {
    int a;
    public homeWork() {
    }

    public homeWork(int a) {
        this.a = a;
    }

    public static void main(String[] args) {


//        111111111111
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] nums = {num1, num2, num3};
//        冒泡算法
        MaoPao(nums, 0);
//     自平衡二叉树
        Tree tree = new Tree();
        tree.push(new Node(null,null,num1));
        tree.push(new Node(null,null,num2));
        tree.push(new Node(null,null,num3));
        tree.centerLoop();

//    22222222
        int length = 0;
        while (length < 5) {
            String[] strings = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
            int index = (int) Math.floor(strings.length / 2);
            int x = length;
            int f = 0;
            while (x >= 0) {
                strings[index + f] = "*";
                strings[index - f] = "*";
                f++;
                x--;
            }
            System.out.println(Arrays.toString(strings));
            length++;
        }

// 5555555
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" " + i + "*" + j + "=" + (i * j) + "\t");
                if (i == j) {
                    System.out.print("\n");
                }

            }
        }
// 33333333
        System.out.println("输入三条边");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        int c = scanner1.nextInt();
        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }
// 444444444
        System.out.println("水仙花");
        Scanner scanner2 = new Scanner(System.in);
        int num = 0;
        boolean retry = false;
        do {
            if (retry) {
                System.out.println("水仙花必须三位");
            }
            num = scanner2.nextInt();
            retry = true;
        } while (String.valueOf(num).length() != 3);
        String s = String.valueOf(num);
        int result1 = Integer.parseInt(String.valueOf(s.charAt(0)));
        int result2 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int result3 = Integer.parseInt(String.valueOf(s.charAt(2)));
        if (num == result1 * result1 * result1 + result2 * result2 * result2 + result3 * result3 * result3) {
            System.out.println("是水仙花");
        } else {
            System.out.println("不是水仙花");
        }
// 6666666666
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                continue;
            }
            String s1 = String.valueOf(i);
            int secondNum = 0;
            if (s1.length() >= 2) {
                secondNum = Integer.parseInt(String.valueOf(s1.charAt(1)));
                if (secondNum == 7) {
                    System.out.println(i);
                }
            }
        }
// 7777777777
        System.out.println("半径为5的园的周长");
        System.out.println(2 * 5 * Math.PI);

    }

    //    冒泡算法 注释都可以删掉 变量名最好改一下
    public static void MaoPao(int[] nums, int index) {
        if (index < nums.length - 1) {
            int point = 0;
            while (point < nums.length - 1) {
                int pre = nums[point];
                int last = nums[point + 1];
                if (pre > last) {
                    nums[point + 1] = pre;
                    nums[point] = last;
                }
                point++;
            }
            index++;
            MaoPao(nums, index);
        } else {
            System.out.println(Arrays.toString(nums));
        }
    }
}

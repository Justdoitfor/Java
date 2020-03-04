package practice.Random;

import java.util.Random;

/*
根据int变量n的值，来获取随机数字，范围是【1，n】，
可以取到1，也可以取到n。
 */
public class Demo02Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int result = r.nextInt(n)+1; // 本来范围是[0-n),整体+1后变为[1-n]
            System.out.println(result);
        }

    }
}

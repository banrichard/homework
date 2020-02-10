
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int hour = 0;
        int min = 0;
        int sec = 0;

        if (n >= 3600) {                //计算出几个小时
            hour = n / 3600;
            n -= hour * 3600;
        }
        if (n >= 60) {
            //计算出剩几分钟
            min = n / 60;
            n -= min * 60;
        }
        sec = n;
        System.out.print(String.valueOf(hour) + ":" + String.valueOf(min) + ":" + String.valueOf(sec));
    }

}

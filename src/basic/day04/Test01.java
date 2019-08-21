package basic.day04;

import java.util.Scanner;

//  录入税前薪资，计算税后收入
//	 5000~8000  3%		8000~12000   10%		12000~20000   20%		20000以上   25%  
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前薪资：");
        double salary = sc.nextInt();
        double income = 0; // 税后收入
        double tax = 0; // 税

        sc.close();

        if (salary < 0) {
            System.out.println("输入有误！");
            return;
        }

        if (salary < 5000) {
            System.out.println("不需要交税");
            return;
        }

        if (salary < 8000) {
            tax = (salary - 5000) * 0.03;
        } else if (salary < 12000) {
            tax = 3000 * 0.03 + (salary - 8000) * 0.1;
        } else if (salary < 20000) {
            tax = 3000 * 0.03 + 4000 * 0.1 + (salary - 12000) * 0.2;
        } else {
            tax = 3000 * 0.03 + 4000 * 0.1 + 8000 * 0.2 + (salary - 20000) * 0.25;
        }

        income = salary - tax;
        System.out.println("税后薪资：" + income);
    }
}

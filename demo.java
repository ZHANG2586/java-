import java.util.Scanner;
public class demo{
         public static void main(String[] args)
         {
                System.out.println("请输入员工姓名:");
                Scanner a1=new Scanner(System.in);                
                System.out.println("请输入一周工作时数:");
                Scanner a2=new Scanner(System.in);
                System.out.println("请输入小时工资:");
                Scanner a3=new Scanner(System.in);                
                System.out.println("请输入联邦预扣税率:");
                Scanner a4=new Scanner(System.in);
                System.out.println("请输入州预扣税率:");
                Scanner a5=new Scanner(System.in);
                double[] a=new double[4];
                int i=0;
                String b=a1.nextLine();
                a[i++]=a2.nextDouble();
                a[i++]=a3.nextDouble();
                a[i++]=a4.nextDouble();
                a[i++]=a5.nextDouble();
                System.out.println("雇员姓名："+b);
                System.out.println("工时："+a[0]);
                System.out.println("工资率："+a[1]);
                System.out.println("毛薪水："+a[0]*a[1]);
                System.out.println("联邦扣缴额："+a[0]*a[1]*a[2]);
                System.out.println("州扣缴款："+a[0]*a[1]*a[3]);
                System.out.println("扣除总额：$"+a[0]*a[1]*(a[2]+a[3]));
                System.out.println("净薪水：$"+a[0]*a[1]*(1-a[2]-a[3]));
        }







}
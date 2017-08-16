/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;
import java.util.Scanner;
public class CGPA {
    public static double cgpa(double java, double algo, double data){
        if(java>=80)java=4;
        else if(java<80 && java >=70)java=3.5;
        else if(java<70 && java >=60)java=3;
        else java=0;
        if(algo>=80)algo=4;
        else if(algo<80 && algo >=70)algo=3.5;
        else if(algo<70 && algo >=60)algo=3;
        else algo=0;
        if(data>=80)data=4;
        else if(data<80 && data >=70)data=3.5;
        else if(data<70 && data >=60)data=3;
        else data=0;
        return ((java*4)+(algo*4)+(data*4))/12;
    }
    public static String waiver(double java, double algo, double data){
        double cgpa = cgpa(java,algo,data);
        if(cgpa>=3.9)
            return "50% waiver";
        else if(cgpa>=3.5 && cgpa<3.9)
            return "20% Waiver";
        else
            return "No Wiaver";
    }
    public static void main(String[] args) {
        double java, algo, data;
        Scanner bucky = new Scanner(System.in);
        java=bucky.nextDouble();
        algo=bucky.nextDouble();
        data=bucky.nextDouble();
        System.out.println(waiver(java,algo,data));
    }
    
}

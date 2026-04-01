package baekjoon.silver;

import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int money = sc.nextInt();

    int[] sp = new int[14]; 
    for(int i=0; i<14; i++){
        sp[i] = sc.nextInt();
    }

    //준현
    int jhcash= money;
    int jhstock=0;

    for(int i=0; i<14; i++){
    if(jhcash>=sp[i]){
        jhstock += jhcash/sp[i];
        jhcash = jhcash%sp[i];
    }
    }

    int bnp= jhcash+(jhstock*sp[13]);

    //성민
    int smcash= money;
    int smstock=0;

    for(int i=0; i<14; i++){
    if(3일연속 오를떄){

    }
    if(3일연속 내릴떄){

    }
    }

    int timing= smcash+(smstock*sp[13]);
    
    if(bnp>timing){
        System.out.pirntln("BNP");
        }else if (timing>bnp){
        System.out.pirntln("TIMING");
        }else if(bnp == timing){
        System.out.pirntln("SAMESAME");
    }
    }

}

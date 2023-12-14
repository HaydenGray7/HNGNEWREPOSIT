public class Exercise1 {


    public static void main(String[] args){

        int qtrNum = 65;
        double QTRVal = .25;
        double qtrTotal;
        double qtrEVTotal;
        int NUMFWENDS = 3;
        int qtrRmain;
        double ValRmain;
        double Val1FWEND;
        double Val2FWENDS;
        double Val2FWENDS_ANDLFTovr;
        
        qtrTotal = QTRVal * qtrNum;
        System.out.println("Total amount: $" + qtrTotal);
        qtrRmain = qtrNum % NUMFWENDS;
        System.out.println("Quarters left: " + qtrRmain);
        ValRmain = qtrRmain * QTRVal;
        qtrEVTotal = qtrTotal - ValRmain;
        Val1FWEND = qtrEVTotal / NUMFWENDS;
        System.out.println("Total 1 friend has: $" + Val1FWEND);
        Val2FWENDS = Val1FWEND * 2;
        System.out.println("Total amount 2 friends have(Jack): $" + Val2FWENDS);
        ValRmain = qtrRmain * QTRVal;
        Val2FWENDS_ANDLFTovr = Val2FWENDS + ValRmain;
        System.out.println("Total of 2 friends and left over pile: $" + Val2FWENDS_ANDLFTovr);

    }

}
public class Exercise2 {


    public static void main(String[] args){

        int Year;
        int Leap=4;
        int R1;
        int CENT=100;
        int R2;
        int LepCENT=400;
        int R3;
        double f;
        boolean CDT1;
        boolean CD1;
        boolean CD2;
        boolean CD3;

        R1=Year%Leap;
        if(R1==0){
            CD1=true;
        }
        R2=Year%CENT;
        if(R2==0){
            CD2=true;
        }
        R3=Year%LepCENT;
        if(R3==0){
            CD3=true;
        }

        CDT1=false;
       If(CD1==true){
        if(CD2==false){
        CDT1=true;
        }
        if(CD2==true)
            if(CD3==true){
            CDT1=true;
            }
       }
        if(CDT1==true)
        {
            System.out.println(Year + "is a leap year"_);
        }
        if(CDT1!=true){
        System.out.println(Year + "is not a leap year"_);
        }

    }

}
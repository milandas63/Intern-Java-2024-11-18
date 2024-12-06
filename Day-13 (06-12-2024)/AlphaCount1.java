
public class AlphaCount1 {
    public static void main(String[] args) {
        String text = "Hello World";
        char c;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;
        int countH = 0;
        int countI = 0;
        int countJ = 0;
        int countK = 0;
        int countL = 0;
        int countM = 0;
        int countN = 0;
        int countO = 0;
        int countP = 0;
        int countQ = 0;
        int countR = 0;
        int countS = 0;
        int countT = 0;
        int countU = 0;
        int countV = 0;
        int countW = 0;
        int countX = 0;
        int countY = 0;
        int countZ = 0;

        for(int i=0; i<text.length(); i++) {
            c = text.charAt(i);
            if(c==65 || c==97) 		 countA++;
            else if(c==66 || c==98)  countB++;
            else if(c==67 || c==99)  countC++;
            else if(c==68 || c==100) countD++;
            else if(c==69 || c==101) countE++;
            else if(c==70 || c==102) countF++;
            else if(c==71 || c==103) countG++;
            else if(c==72 || c==104) countH++;
            else if(c==73 || c==105) countI++;
            else if(c==74 || c==106) countJ++;
            else if(c==75 || c==107) countK++;
            else if(c==76 || c==108) countL++;
            else if(c==77 || c==109) countM++;
            else if(c==78 || c==110) countN++;
            else if(c==79 || c==111) countO++;
            else if(c==80 || c==112) countP++;
            else if(c==81 || c==113) countQ++;
            else if(c==82 || c==114) countR++;
            else if(c==83 || c==115) countS++;
            else if(c==84 || c==116) countT++;
            else if(c==85 || c==117) countU++;
            else if(c==86 || c==118) countV++;
            else if(c==87 || c==119) countW++;
            else if(c==88 || c==120) countX++;
            else if(c==89 || c==121) countY++;
            else if(c==90 || c==122) countZ++;
        }

        if(countA>0) System.out.println("A = "+countA);
        if(countB>0) System.out.println("B = "+countB);
        if(countC>0) System.out.println("C = "+countC);
        if(countD>0) System.out.println("D = "+countD);
        if(countE>0) System.out.println("E = "+countE);
        if(countF>0) System.out.println("F = "+countF);
        if(countG>0) System.out.println("G = "+countG);
        if(countH>0) System.out.println("H = "+countH);
        if(countI>0) System.out.println("I = "+countI);
        if(countJ>0) System.out.println("J = "+countJ);
        if(countK>0) System.out.println("K = "+countK);
        if(countL>0) System.out.println("L = "+countL);
        if(countM>0) System.out.println("M = "+countM);
        if(countN>0) System.out.println("N = "+countN);
        if(countO>0) System.out.println("O = "+countO);
        if(countP>0) System.out.println("P = "+countP);
        if(countQ>0) System.out.println("Q = "+countQ);
        if(countR>0) System.out.println("R = "+countR);
        if(countS>0) System.out.println("S = "+countS);
        if(countT>0) System.out.println("T = "+countT);
        if(countU>0) System.out.println("U = "+countU);
        if(countV>0) System.out.println("V = "+countV);
        if(countW>0) System.out.println("W = "+countW);
        if(countX>0) System.out.println("X = "+countX);
        if(countY>0) System.out.println("Y = "+countY);
        if(countZ>0) System.out.println("Z = "+countZ);
    }
}

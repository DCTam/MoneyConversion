package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] base = {"USD","Euro","Canadian","Yuan","Yen","Pound"};
        int n = JOptionPane.showOptionDialog(null, "Please select the base currency you want to convert", "Currency to convert", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, base, base[0]);
        if(n == JOptionPane.CLOSED_OPTION){JOptionPane.showMessageDialog(null,"You have just cancelled the program."); System.exit(0); }

        String[] afterconvert = {"USD","Euro","Canadian","Yuan","Yen","Pound"};
        int y = JOptionPane.showOptionDialog(null,"Please select the currency you want to convert into","Convert to what",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,afterconvert,afterconvert[0]);
        if(y == JOptionPane.CLOSED_OPTION){JOptionPane.showMessageDialog(null,"You have just cancelled the program."); System.exit(0); }

        if(n == y){JOptionPane.showMessageDialog(null,"You cannot convert the same type of currency"); System.exit(0) ;}

        String userinput2 = JOptionPane.showInputDialog(null,"Please enter the amount of " + base[n] + " that you want to convert into " + afterconvert[y] , "Amount", JOptionPane.INFORMATION_MESSAGE);
        if(userinput2 == null){JOptionPane.showMessageDialog(null,"You have just cancelled the program.");System.exit(0);}
        try{
            double userinput = Double.parseDouble(userinput2);
        }
        catch(NumberFormatException z){
            JOptionPane.showMessageDialog(null,"Please enter numbers only");System.exit(0);
        }
        double userinput = Double.parseDouble(userinput2);
        if(userinput < 0){JOptionPane.showMessageDialog(null,"Please enter a positve value only."); System.exit(0);}


        if((n == 0) && (y == 1))
            JOptionPane.showMessageDialog(null,userinput + " " + base[0] +  " equals to " + userinput * .721168 + " " + afterconvert[1] );

        else if ((n == 0) && (y == 2))
            JOptionPane.showMessageDialog(null,userinput + " " + base[0] +  " equals to " + userinput * 1.096283 + " " + afterconvert[2] );

        else if ((n == 0) && (y == 3))
            JOptionPane.showMessageDialog(null,userinput + " " + base[0] +  " equals to " + userinput * 6.259598 + " " + afterconvert[3] );

        else if ((n == 0) && (y == 4))
            JOptionPane.showMessageDialog(null,userinput + " " + base[0] +  " equals to " + userinput * 102.220254 + " " + afterconvert[4] );

        else if ((n == 0) && (y == 5))
            JOptionPane.showMessageDialog(null,userinput + " " + base[0] +  " equals to " + userinput * 0.592717 + " " + afterconvert[5] );

        if((n == 1) && (y == 0))
            JOptionPane.showMessageDialog(null,userinput + " " + base[1] +  " equals to " + userinput * 1.386796 + " " + afterconvert[0] );

        else if((n == 1) && (y == 2))
            JOptionPane.showMessageDialog(null,userinput + " " + base[1] +  " equals to " + userinput * 1.520019 + " " + afterconvert[2] );

        else if((n == 1) && (y == 3))
            JOptionPane.showMessageDialog(null,userinput + " " + base[1] +  " equals to " + userinput * 8.681612 + " " + afterconvert[3] );

        else if((n == 1) && (y == 4))
            JOptionPane.showMessageDialog(null,userinput + " " + base[1] +  " equals to " + userinput * 141.770410 + " " + afterconvert[4] );

        else if((n == 1) && (y == 5))
            JOptionPane.showMessageDialog(null,userinput + " " + base[1] +  " equals to " + userinput * 0.821883 + " " + afterconvert[5] );

        if((n == 2) && (y == 0))
            JOptionPane.showMessageDialog(null,userinput + " " + base[2] +  " equals to " + userinput * 0.912330 + " " + afterconvert[0] );

        else if((n == 2) && (y == 1))
            JOptionPane.showMessageDialog(null,userinput + " " + base[2] +  " equals to " + userinput * 0.657909 + " " + afterconvert[1] );

        else if((n == 2) && (y == 3))
            JOptionPane.showMessageDialog(null,userinput + " " + base[2] +  " equals to " + userinput * 5.710864 + " " + afterconvert[3] );

        else if((n == 2) && (y == 4))
            JOptionPane.showMessageDialog(null,userinput + " " + base[2] +  " equals to " + userinput * 93.275947 + " " + afterconvert[4] );

        else if((n == 2) && (y == 5))
            JOptionPane.showMessageDialog(null,userinput + " " + base[2] +  " equals to " + userinput * 0.540703 + " " + afterconvert[5] );

        if((n == 3) && (y == 0))
            JOptionPane.showMessageDialog(null,userinput + " " + base[3] +  " equals to " + userinput * 0.159747 + " " + afterconvert[0] );

        else if((n == 3) && (y == 1))
            JOptionPane.showMessageDialog(null,userinput + " " + base[3] +  " equals to " + userinput * 0.115198 + " " + afterconvert[1] );

        else if((n == 3) && (y == 2))
            JOptionPane.showMessageDialog(null,userinput + " " + base[3] +  " equals to " + userinput * 0.175042 + " " + afterconvert[2] );

        else if((n == 3) && (y == 4))
            JOptionPane.showMessageDialog(null,userinput + " " + base[3] +  " equals to " + userinput * 16.331007 + " " + afterconvert[4] );

        else if((n == 3) && (y == 5))
            JOptionPane.showMessageDialog(null,userinput + " " + base[3] +  " equals to " + userinput * 0.094684 + " " + afterconvert[5] );

        if((n == 4) && (y == 0))
            JOptionPane.showMessageDialog(null,userinput + " " + base[4] +  " equals to " + userinput * 0.009782 + " " + afterconvert[0] );

        else if((n == 4) && (y == 1))
            JOptionPane.showMessageDialog(null,userinput + " " + base[4] +  " equals to " + userinput * 0.007055 + " " + afterconvert[1] );

        else if((n == 4) && (y == 2))
            JOptionPane.showMessageDialog(null,userinput + " " + base[4] +  " equals to " + userinput * 0.010718 + " " + afterconvert[2] );

        else if((n == 4) && (y == 3))
            JOptionPane.showMessageDialog(null,userinput + " " + base[4] +  " equals to " + userinput * 0.061238 + " " + afterconvert[3] );

        else if((n == 4) && (y == 5))
            JOptionPane.showMessageDialog(null,userinput + " " + base[4] +  " equals to " + userinput * 0.005798 + " " + afterconvert[5] );

        if((n == 5) && (y == 0))
            JOptionPane.showMessageDialog(null,userinput + " " + base[5] +  " equals to " + userinput * 1.687195 + " " + afterconvert[0] );

        else if((n == 5) && (y == 1))
            JOptionPane.showMessageDialog(null,userinput + " " + base[5] +  " equals to " + userinput * 1.216718 + " " + afterconvert[1] );

        else if((n == 5) && (y == 2))
            JOptionPane.showMessageDialog(null,userinput + " " + base[5] +  " equals to " + userinput * 1.848746 + " " + afterconvert[2] );

        else if((n == 5) && (y == 3))
            JOptionPane.showMessageDialog(null,userinput + " " + base[5] +  " equals to " + userinput * 10.561571 + " " + afterconvert[3] );

        else if((n == 5) && (y == 4))
            JOptionPane.showMessageDialog(null,userinput + " " + base[5] +  " equals to " + userinput * 172.471467 + " " + afterconvert[4] );

    }


}
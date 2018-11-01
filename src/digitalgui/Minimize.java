/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalgui;

import java.util.Scanner;
import java.util.Vector;
import javax.swing.JTextArea;

/**
 *
 * @author arabtech
 */
public class Minimize {

    public static Vector<Vector<String>> groups = new Vector<>();
    public static Vector<String> edits = new Vector<>();
    public static Vector<String> print = new Vector<>();
    public static Vector<String> printN = new Vector<>();
    public static Vector<Vector<Boolean>> check = new Vector<>();
    public static int nV, nD, nG, nE1, nE2, index;
    public static boolean checkV;
    public static String str = "";
    public static int[] nE = new int[100];
    public static Scanner scan = new Scanner(System.in);

    public String toBinary(int num) {
        String s1 = Integer.toBinaryString(num);
        String binary = "";
        for (int i = 0; i < nG - 1 - s1.length(); i++) {
            binary += "0";
        }
        binary += s1;
        return binary;
    }

    public int compare(String s1, String s2) {
        int diff = 0;
        str = "";
        index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                str += s1.charAt(i);
            } else if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
                index = i;
                str += "-";
            }
        }
        return diff;
    }

    public String convert(String s) {
        String s1 = "";
        int c1 = 65;
        char c = (char) c1;
        for (int i = 0; i < nG - 1; i++) {
            if (s.charAt(i) == '1') {
                s1 += String.valueOf((char) (65 + i));
            } else if (s.charAt(i) == '0') {
                s1 += String.valueOf((char) (65 + i));;
                s1 += "'";
            }
        }
        return s1;
    }

    public void printElemnts(JTextArea a) {
        for (int i = 0; i < print.size(); i++) {
            String s = a.getText();
            a.setText(s + "\n                      " + convert(print.get(i)));
        }
    }

    public void PrintSteps(JTextArea Steps) {
        for (int i = 0; i < nG; i++) {
            int sizee = groups.get(i).size();
            if (sizee > 0) {
                for (int y = 0; y < sizee; y++) {
                    if (printN.contains(groups.get(i).get(y))) {
                        String s = Steps.getText();
                        Steps.setText(s + "\n" + groups.get(i).get(y) + "*");
                    } else {
                        String s = Steps.getText();
                        Steps.setText(s + "\n" + groups.get(i).get(y));
                    }
                }
                String s = Steps.getText();
                Steps.setText(s + "\n" + "--------");
            }
        }
        String s = Steps.getText();
        Steps.setText(s + "\n" + "==============");
    }
    
    public void reset(){
        groups.removeAllElements();
        edits.removeAllElements();
        print.removeAllElements();
        printN.removeAllElements();
        check.removeAllElements();
        checkV=false;        
        str="";                
        nV=0;
        nD=0;
        nG=0;
        nE1=0;
        nE2=0;
        index=0;
    }
 
    public void minimizeIt(JTextArea Ans, JTextArea Steps) {
        for (int i = 0; i < nG; i++) {
            if (groups.get(i).size() > 0) {
                checkV = true;
            }
        }

        while (checkV) {
           // PrintSteps(Steps);            
            checkV = false;
            for (int i = 0; i < nG - 1; i++) {
                for (int y = 0; y < groups.get(i).size(); y++) {
                    for (int j = 0; j < groups.get(i + 1).size(); j++) {
                        if (compare(groups.get(i).get(y), groups.get(i + 1).get(j)) == 1) {
                            check.get(i).set(y, true);
                            check.get(i + 1).set(j, true);
                            edits.add(str);
                        }
                    }
                    if (check.get(i).get(y) == false && !print.contains(groups.get(i).get(y))) {
                        print.add(groups.get(i).get(y));
                        String s = Steps.getText();
                        Steps.setText(s + "\n\t" + groups.get(i).get(y) + "*");
                    }
                    else{
                        String s = Steps.getText();
                        Steps.setText(s + "\n\t" + groups.get(i).get(y));
                    }
                }
                String s = Steps.getText();
                Steps.setText(s + "\n\t" + "--------");
                groups.get(i).removeAllElements();
                check.get(i).removeAllElements();
                int n = edits.size();
                for (int z = 0; z < n; z++) {
                    groups.get(i).add(edits.remove(0));
                    check.get(i).add(false);
                }
            }
            
            for (int i = 0; i < groups.get(nG - 1).size(); i++) {
                if (check.get(nG - 1).get(i) == false && !print.contains(groups.get(nG - 1).get(i))) {
                    print.add(groups.get(nG - 1).get(i));
                    String s = Steps.getText();
                    Steps.setText(s + "\n\t" + groups.get(nG - 1).get(i) + "*");
                }
                else{
                    String s = Steps.getText();
                    Steps.setText(s + "\n\t" + groups.get(nG - 1).get(i));
                }
            }
            String s = Steps.getText();
            Steps.setText(s + "\n                  " + "==============");
            groups.get(nG - 1).removeAllElements();

            for (int i = 0; i < nG; i++) {
                if (groups.get(i).size() > 0) {
                    checkV = true;
                }
            }
        }
        printElemnts(Ans);

    }
}

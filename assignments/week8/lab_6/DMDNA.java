/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 6
    File Name: DMDNAjava
    Author: Dustin McClure
    Lab: DNA
    Modified Date: 06/07/2021
*/
import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class DMDNA
{
    public static void main(String[] args) throws FileNotFoundException
    {

    }

    public static String[] intorduction() throws FileNotFoundException
    {
        String[] ioName = new String[2];
        System.out.println("This program reports information about DNA");
        System.out.pringln("nucleotide sequences that may encode");
        System.out.println("proteins.");
        System.out.println("Input file name?");
        Scanner input = new Scanner(System.in);
        ioName[0] = input.next();

        System.out.println("What would you like to call your output file?");
        ioName[1] = input.next();

        return ioName;
    }

    public static void name(String name, PrintStream out)
    { 
        out.println("Region Name: " + name);
    }

    public static String sequence(String sequenceDNA, PrintStream out)
    {
        sequenceDNA = sequenceDNA.toUpperCase();
        out.println("Nucleotides: " + sequenceDNA);
        return sequenceDNA; 
    }

    public static int[] nuc_Count(String sequenceDNA, PrintStream out) throws FileNotFoundException
    {
        int[] counts = new int[UN + 1]; 
        char[] codons = {'A', 'C', 'G', 'T', '-'};
        for(int i = 0; i < sequenceDNA.length(); i++) {
            char c = sequenceDNA.charAt(i);
            for(int j = 0; j < codons.length; j++) {
                if(c == codons[j]) {
                    counts[j]++;
                }
            }
        }
        int[] counts_Short = Arrays.copyOf(counts, 4); 
        out.println("Nuc. Counts: " + Arrays.toString(counts_Short));
        return counts;
    }

    public static double[] masses(int[] nuc_Count, PrintStream out) throws FileNotFoundException
    {
    double[] masses_Constant = {135.128, 111.103, 151.128, 125.107, 100.000};
    double[] masses_Nuc = new double[5];
    double totalMass = 0;
    for(int i = 0; i < 5; i++) { 
            masses_Nuc[i] = nuc_Count[i] * masses_Constant[i];
            totalMass += masses_Nuc[i];
        }       
        
        double[] percentages = convert_Percentage(masses_Nuc, totalMass); 
        double[] percentages2 = Arrays.copyOf(percentages, 4); 
        out.print("Total Mass%: " + Arrays.toString(percentages2) + " of ");
        out.printf("%.1f", totalMass);
        out.println();
        return percentages; 
    }

    public static double[] convert_Percentage(double[] masses_Nuc, double totalMass) throws FileNotFoundException
    {
        double[] percentages = new double[5];
        for(int i = 0; i <=4; i++) {
            percentages[i] = Math.round((masses_Nuc[i] / totalMass * 100) * 10.0) / 10.0;
        }
        return percentages; 
    }

    public static String groupCodons(String sequenceDNA, PrintStream out) throws FileNotFoundException
    {
        String sequenceDNA2 = sequenceDNA.replace("-","");
        int length = sequenceDNA2.length() / NPC;
        String[] codons = new String[length];
        int j = 1; 
        for(int i = 0; i <= sequenceDNA2.length() - NPC; i = i + NPC) {
            String codon = sequenceDNA2.substring(i, NPC * j);
            codons[j - 1] = codon;
            j++;       
      } 
        String codonList = Arrays.toString(codons);
        out.println("Codons List: " + codonList);
        return codonList; 
    }

    public static void proteinTest(String codonList, double[] percentages, PrintStream out)
    {
            if (startTest(codonList) 
            && stopTest(codonList) 
            && mNCTest(codonList) 
            && percentageTest(percentages)) { 
                out.println("Is Protein?: YES");
        } else {
            out.println("Is Protein?: NO");
        }
        out.println(); 
    }

    public static boolean startTest(String codonList)
    {
        return(codonList.substring(1, 4).equals("ATG"));
    }

    public static boolean stopTest(String codonList)
    {
        String EndC  = codonList.substring(codonList.length() - 4, codonList.length() - 1);
      return (EndC.equals("TAA") || EndC.equals("TAG") || EndC.equals("TGA"));
    }
    
    public static boolean mNCTest(String codonList)
    {
        return(codonList.charAt(19) == ',');
    }
    
    public static boolean percentageTest(double[] percentages)
    {
        return(percentages[1] + percentages[2] >= 30.0);
    }
}

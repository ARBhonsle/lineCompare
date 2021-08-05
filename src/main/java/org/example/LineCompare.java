package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Line Compare program compares line lengths
 *
 */
public class LineCompare
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Welcome to Line Comparison Computation Program!" );
        //variables
        double lineLength;
        int[] x=new int[2];
        int[] y=new int[2];
        System.out.println("Give coordinates(x,y)");
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<2;i++){
            System.out.println((i+1)+"Point: x-coordinate");
            x[i]=Integer.parseInt(read.readLine());
            System.out.println((i+1)+"Point: y-coordinate");
            y[i]=Integer.parseInt(read.readLine());
        }
        lineLength=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
        System.out.println("Line Length:"+lineLength);
    }
}

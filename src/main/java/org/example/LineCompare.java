package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Line Compare program compares line lengths
 * computing line length from coordinate points,
 * compare two line using coordinates to show for line equality and Greater/Lesser
 */
public class LineCompare
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Welcome to Line Comparison Computation Program!" );
        //variables
        Double[] lineLength= new Double[2];
        int[] x=new int[4];
        int[] y=new int[4];
        System.out.println("Give coordinates(x,y)");
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<4;i++){
            System.out.println((i%2+1)+"Line points:");
            System.out.println((i+1)+"Point: x-coordinate");
            x[i]=Integer.parseInt(read.readLine());
            System.out.println((i+1)+"Point: y-coordinate");
            y[i]=Integer.parseInt(read.readLine());
        }
        //line Inequality check
        lineLength[0]=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
        lineLength[1]=Math.sqrt(Math.pow(x[2]-x[3],2)+Math.pow(y[2]-y[3],2));
        System.out.println(lineLength[0].compareTo(lineLength[1]));
        if(lineLength[0].compareTo(lineLength[1])<0){
            System.out.println("Line 1 length lesser than Line 2");
        }else if(lineLength[0].compareTo(lineLength[1])>0){
            System.out.println("Line 1 length greater than Line 2");
        }else {
            System.out.println("Line lengths are Equal");
        }
    }
}

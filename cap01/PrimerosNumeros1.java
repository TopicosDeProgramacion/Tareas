/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;
/**
 *
 * @author eduar
 */
public class PrimerosNumeros1 
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i <= n)
        {
            System.out.println(i);
            i++;
        }
    }
}

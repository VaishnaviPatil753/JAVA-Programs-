// 883042
// 0 : 1
// 2 : 1
// 3 : 1
// 4 : 1
// 8 : 2

import java.util.*;

class Program247
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.CountDigit(iValue);
    }
}

class Digits
{
    public void CountDigit(int iNo)
    {
        int iCount = 0,iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 9)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        System.out.println("Frequency of 9 is : "+iCount);
    }
}


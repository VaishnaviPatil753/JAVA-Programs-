import java.util.*;

class Program263
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0, i = 0, iRet = 0;

        System.out.println("Enter the number of element :");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);
        
        aobj.Accept();
        aobj.Display();
        aobj.CountDigits();

        System.out.println("Summation of all elements : "+iRet);
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Elements of the array are : ");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public int CountDigits()
    {
        int i = 0,iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            while(Arr[i] != 0)
            {
                iCount++;
                Arr[i] = Arr[i] / 10;
            }
            System.out.println(iCount);
            iCount = 0;
        }
    }
}

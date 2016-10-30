import java.util.Scanner;



public class threadMatrix
{
    static int c,d,f,g,h=0,q,w,y,t;

    static	int a[][]=new int[3][3];

    static  int b[][]=new int[3][3];

    static  int answer[][]=new int [3][3];
    public synchronized void row1() {
    	for(d=0; d<3; d++)
        {
             h=0;
            for(f=0; f<3; f++)
            {
                h=h+a[0][f]*b[f][d];
            }
            answer[0][d]=h;
            System.out.print(answer[0][d]+" ");



        }
        System.out.print("\n");
	}
    public synchronized void row2() {
    	for(d=0; d<3; d++)
        {
             h=0;
            for(f=0; f<3; f++)
            {
                h=h+a[1][f]*b[f][d];
            }
            answer[1][d]=h;
            System.out.print(answer[1][d]+" ");



        }
        System.out.print("\n");
	}
    public synchronized void row3() {
    	for(d=0; d<3; d++)
        {
             h=0;
            for(f=0; f<3; f++)
            {
                h=h+a[2][f]*b[f][d];
            }
            answer[2][d]=h;
            System.out.print(answer[2][d]+" ");



        }
        System.out.print("\n");
	}
    public void domul(){

            Thread t1 = new Thread(new Runnable()
            {


                public void run()
                {

                    row1();



                }
            });

         Thread t2 = new Thread(new Runnable()  //row 2
            {


                public void run()
                {

                    row2();


                }
            });

            Thread t3 = new Thread(new Runnable()  //row 3
            {


                public void run()
                {

                    row3();



                }
            });


        t1.start();
        t2.start();
        t3.start();

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e)
        {

            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {

        Scanner ind=new Scanner(System.in);


        for(c=0; c<3; c++)
        {
            for(d=0; d<3; d++)
            {
                a[c][d]= ind.nextInt();
            }
        }
	    }
        for(c=0; c<3; c++)
        {
            for(d=0; d<3; d++)
            {
                b[c][d]= ind.nextInt();
            }
        }


        threadMatrix ob=new threadMatrix();
        ob.domul();


    }
}












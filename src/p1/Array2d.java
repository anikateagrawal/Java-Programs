package p1;
public class Array2d {
    public static void main(String[] args) {
        int k=0;
        int[][] arr=new int [2][2];
        System.out.println("The given array is: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=Integer.parseInt(args[k++]);
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the array is:");
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<2;j++) {
                int temp=arr[1 - i][1 - j];
                arr[1 - i][1 - j]=arr[i][j];
                arr[i][j] = temp;
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}

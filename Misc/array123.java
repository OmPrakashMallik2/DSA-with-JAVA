
public class array123{
    public static void main(String[] args) {

        // 2D array implementation 

        // int [][] opm = new int[5][4];
        // int xuv = 5;
        
        // for(int i=0; i<opm.length; i++){
        //     for(int j=0; j<opm[i].length; j++){
        //         opm[i][j] = xuv;
        //         xuv++;
        //     }
        // }





        // for(int i=0; i<opm.length; i++){
        //     for(int j=0; j<opm[i].length; j++){
        //         System.out.print(opm[i][j]+"  ");
        //     }
        //     System.out.println();
        // }

        int[] op = new int[4];

        int count = 20;
        for(int x=0; x<=op.length; x++){
            op[x] = count;
            count = count + 6;
        }

        for(int x=0; x<=op.length; x++){
            System.out.println(op[x]);
        }

    }
}
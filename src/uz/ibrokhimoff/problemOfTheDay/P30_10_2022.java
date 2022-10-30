package uz.ibrokhimoff.problemOfTheDay;

public class P30_10_2022 {
    public static void main(String[] args) {

    }
    public long NoOfChicks(int N)
    {
        if(N<=1) return 1;
        if(N <= 6){
            return 3 * NoOfChicks(N -1);
        }
        else if ( N == 7){
            return( 3 * NoOfChicks(N-1) - 3 * NoOfChicks(N-6));
        }
        else{
            return (3 * NoOfChicks(N-1) - 2 * NoOfChicks(N-6));
        }
    }
}

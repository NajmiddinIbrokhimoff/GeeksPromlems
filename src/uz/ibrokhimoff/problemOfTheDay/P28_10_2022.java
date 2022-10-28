package uz.ibrokhimoff.problemOfTheDay;

public class P28_10_2022 {
    public static void main(String[] args) {
        System.out.println(NthTerm(5));
    }

        public static int NthTerm(int n)
        {
            long t = 2;
            int mod = 1000000007;
            for(int i = 1;i<n;i++){
                t = (long)(t*(i+1)%mod+1)%mod;
            }
            return (int)t;
        }

}

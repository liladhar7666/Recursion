package java3.recursionProblem1;

public class recursionProblems {
    public static void main(String[] args) {
        System.out.println(nCr(6,3));
        System.out.println(Josephus(5,3));
    }
    //    pascal triangle

    static int nCr(int n, int r) {
        if (n == r || r == 0) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);

    }
    static int Josephus(int n, int k){
        if(n == 1)return 0;
        return (Josephus(n-1,k)+k)%n;
    }


}
import static java.lang.Integer.MIN_VALUE;
//WRONG
public class MaxWealth {
    public static void main(String[] args) {
        int [][]accounts= new int[][]{{1, 23, 53}, {4, 23, 53, 66}, {43, 77, 1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int [][]accounts){
        int ans = Integer.MIN_VALUE;
        for(int person=0;person>accounts.length;person++){
            int rowsum=0;
            for(int account=0;account<accounts[person].length;account++){
                rowsum+=accounts[person][account];
            }
            if(rowsum>ans){
                ans=rowsum;
            }
        }
        return ans;
    }
}

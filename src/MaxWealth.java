
public class MaxWealth {
    public static void main(String[] args) {
        int [][]accounts= new int[][]{{1, 23, 53}, {4, 23, 53, 66}, {43, 77, 1}};
        int res=maximumWealth(accounts);
        System.out.println(res);
    }
    static int maximumWealth(int [][]accounts){
        int ans = Integer.MIN_VALUE;
        int person=0;
        while (person<accounts.length) {
            int rowsum=0;
            for(int account=0;account<accounts[person].length;account++){
                rowsum+=accounts[person][account];
            }
            if(rowsum>ans){
                ans=rowsum;
            }
            person++;
        }
        return ans;
    }
}

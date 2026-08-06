class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int p1=0,p2=1;
            for(int i=2;i<=n;i++){
                int v=p1+p2;
                p1=p2;
                p2=v;
            }
            return p2;
        }
        
    }
}
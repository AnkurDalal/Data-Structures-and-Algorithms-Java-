 package SegmentTrees;
//code to build a segement tree
 public class ConstructionOfSt {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildTree(int arr[],int i,int st,int end){
        if (st==end) {
            tree[i]=arr[st];
            return arr[st];
        }
        int mid=(st+end)/2;
        buildTree(arr, 2*i+1, st, mid);
        buildTree(arr, 2*i+2, mid+1, end);
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }
    //code for query on segment tree
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if (qj<=si||qi>=sj) {//non overlapping
            return 0;
        }else if (si>=qi&&sj<=qj) {//overlapping
            return tree[i];
        }else{//partial overlapping
            int mid=(si+sj)/2;
            int left=getSumUtil(2*i+1, si, mid, qi, qj);
            int right=getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    //code for updation in segment tree
    public static void updateUtil(int i,int si,int sj,int idx,int diff){
       if (idx<si||idx>sj) {
        return;
       }
       tree[i]+=diff;
       if (si!=sj) {//non leaf
          int mid=(si+sj)/2;
          updateUtil(2*i+1, 0, mid, idx, diff);
          updateUtil(2*i+2, mid+1, sj, idx, diff);
       }
    }
    public static void update(int arr[],int idx,int newValue){
        int n=arr.length;
        int diff=newValue-arr[idx];
        arr[idx]=newValue;
        updateUtil(0, 0, n-1, idx, diff);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildTree(arr, 0, 0, n-1);
       // for(int i=0;i<tree.length;i++){
        //    System.out.print(tree[i]+" ");
       // }
       System.out.println(getSum(arr, 2, 5));
       update(arr, 2, 2);
       System.out.println(getSum(arr, 2, 5));
    }
}
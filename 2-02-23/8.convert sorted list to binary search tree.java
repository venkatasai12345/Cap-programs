class Solution {
    int count=0;
    public int iterate(ListNode head){
        ListNode temp=head;
        if(head==null){
            return 0;
        }
        while(temp!=null){
            temp=temp.next;
            count=count+1;
        }
        return count;
    }
    int co=0;
    public int find(ListNode head, int n){
        ListNode temp=head;
        if(head==null){
            return 0;
        }
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        return temp.val;  
    }

    public TreeNode construct(ListNode head,int low ,int high){
        if(head==null){
            return null;
        }
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        int data=find(head,mid);
        TreeNode root=new TreeNode(data);
        root.left=construct(head,low,mid-1);
        root.right=construct(head,mid+1,high);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        int size=iterate(head)-1;
        return construct(head,0,size);
    }
}

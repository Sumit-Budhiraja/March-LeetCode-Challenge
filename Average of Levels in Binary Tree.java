class Solution {

    // TC: O(n)
    // SC : O(log(n))
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            double totalSum = 0;
            int noOfEl = size;
            while(size-->0){
                TreeNode head = qu.poll();
                totalSum += head.val;
                if(head.left!=null){
                    qu.offer(head.left);
                }
                if(head.right!=null){
                    qu.offer(head.right);
                }
            }
            ans.add(new Double(totalSum/noOfEl));
        }
        return ans;
    }
}
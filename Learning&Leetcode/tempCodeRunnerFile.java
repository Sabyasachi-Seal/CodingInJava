public int lengthOfLIS(int[] nums) {
        subs(nums, new ArrayList<>(), 0);
        return max;
    }
    public void subs(int arr[], ArrayList<Integer> ans, int i){
        if(i == arr.length){
            if(ans.size()>max && isincreasing(ans)){
                max  = ans.size();
                System.out.println(ans);
            }
            return;
        }
        ans.add(arr[i]);
        subs(arr, ans, i+1);
        ans.remove(ans.size()-1);
        subs(arr, ans, i+1);
    }
    public boolean isincreasing(ArrayList<Integer> ans){
        for (int i = 0; i < ans.size()-1; i++) {
            if(ans.get(i)>=ans.get(i+1)) return false; 
        }
        return true;
    }
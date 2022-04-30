  int count = 0;
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            while(j<nums.length && nums[j]==nums[i]){
                count++;
                j++;
            }
            nums[++i] = nums[j];
        }
        return nums.length - count;
    }
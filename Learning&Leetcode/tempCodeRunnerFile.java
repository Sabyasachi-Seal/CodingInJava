public int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer, Long> factor = new HashMap<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            factor.put(arr[i], 1L);
        }
        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] % arr[j] == 0 && factor.containsKey(arr[i]/arr[j])){
                    factor.put(arr[i], factor.get(arr[i])+(factor.get(arr[j]) * factor.get(arr[i]/arr[j])));
                    ans.add(new int[]{arr[i], arr[j], arr[i]/arr[j]});
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(Arrays.toString(ans.get(i)));
        }
        int sum = 0;
        for (int i = 0; i < factor.size(); i++) {
            sum += factor.get(arr[i]);
        }
        return sum;
    }
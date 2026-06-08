class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // int n = nums.length;

        // List<Integer> lessPivot = new ArrayList<>();
        // List<Integer> equalPivot = new ArrayList<>();
        // List<Integer> greaterPivot = new ArrayList<>();   

        // for (int num : nums) {
        //     if (num < pivot) {
        //         lessPivot.add(num);
        //     } else if (num == pivot) {
        //         equalPivot.add(num);
        //     } else {
        //         greaterPivot.add(num);
        //     }
        // }

        // List<Integer> result = new ArrayList<>();
        // result.addAll(lessPivot);
        // result.addAll(equalPivot);
        // result.addAll(greaterPivot);

        // return result.stream().mapToInt(i -> i).toArray();

        int n = nums.length;

        int countLess = 0;
        int countEqual = 0;

        for (int num : nums) {
            if (num < pivot)
                countLess++;
            else if (num == pivot)
                countEqual++;
        }

        int i = 0; // less than pivot
        int j = countLess; // equal to pivot
        int k = countLess + countEqual; // more than pivot
        int[] result = new int[n];

        for (int num : nums) {
            if (num < pivot) {
                result[i] = num;
                i++;
            } else if (num == pivot) {
                result[j] = num;
                j++;
            } else {
                result[k] = num;
                k++;
            }
        }

        return result;
    }
}

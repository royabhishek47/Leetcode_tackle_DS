//Pascal's triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> first = new ArrayList<>(); 
        first.add(1); 
        result.add(first);
        for (int i = 1; i < numRows; i++){ 
            List<Integer> subList = new ArrayList<>(); 
            subList.add(0, 1); 
            for (int j = 1; j < i; j++){ 
                List<Integer> prevList = result.get(i - 1); 
                int num1 = prevList.get(j-1);
                int num2 = prevList.get(j); 
                int sum = num1 + num2; 
                subList.add(j, sum);
            }
            subList.add(1);
            result.add(subList);
        }
        return result;
    }
}
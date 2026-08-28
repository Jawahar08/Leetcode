class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
         String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };
        backtrack(digits,0,"",phone,result);
        return result;

    }
    private void backtrack(String digits,int index,String current,String[] phone,List<String>result){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        int digit=digits.charAt(index)-'0';
        String letter=phone[digit];
        for(int i=0;i<letter.length();i++){
            backtrack(digits,index+1,current+letter.charAt(i),phone,result);
        }
    }

}
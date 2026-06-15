// Last updated: 6/15/2026, 7:17:36 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List <Boolean> booleanList  = new ArrayList<>();
        for(int i = 0; i< candies.length ; ++i){
            if(candies[i] > greatest){
                greatest = candies[i];
            }
        }
        for(int i = 0; i < candies.length ; ++i){
            if(candies[i] + extraCandies >= greatest) {
                booleanList.add(true);
            }
            else{
                booleanList.add(false);
            }
        }
        return booleanList;
    }
}
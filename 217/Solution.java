class Solution {
    public boolean containsDuplicate(int[] nums) {
        //create the hashset to store element from array
        HashSet<Integer> seenNumbers = new HashSet<>();
        //Iterate each though each elenent ub array
        for(int num : nums){
            //check is the element already in hash
            if(seenNumbers.contains(num)){
                return true; //Dupicate found

            } 
            //Add an alenent to the hashset
            seenNumbers.add(num);
        }
        return false; //no duplivate found
    }
}
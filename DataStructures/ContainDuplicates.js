var containsDuplicate = function(nums) {
    const numSet = new Set();
    
    for (let i = 0; i < nums.length; i++){
        if (!numSet.has(nums[i])){
            console.log(nums[i]);
            numSet.add(nums[i]);
        } else {
            return true;
        }
    }
    return false;
};
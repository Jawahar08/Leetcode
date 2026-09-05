/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    bool* arr=malloc(candiesSize*sizeof(bool));
    *returnSize=candiesSize;
    int maxCandies=candies[0];
    for(int i=1;i<candiesSize;i++){
        int sum=candies[i]+extraCandies;
        if(candies[i]>maxCandies){
            maxCandies=candies[i];
        }
    }
    for(int i=0;i<candiesSize;i++){
        if(candies[i]+extraCandies>=maxCandies){
            arr[i]=true;
        }
        else{
            arr[i]=false;
        }
    }
    return arr;

}
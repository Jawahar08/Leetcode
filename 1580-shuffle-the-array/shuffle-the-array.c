

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int* arr=malloc(numsSize*sizeof(int));
    *returnSize=numsSize;
    int j=n;
    for(int i=0;i<n;i++){
        arr[2*i]=nums[i];
        arr[2*i+1]=nums[j];
        j++;
    }
    return arr;
}
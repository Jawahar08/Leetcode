int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    int maxWelth=0;
    for(int i=0;i<accountsSize;i++){
        int sum=0;
        for(int j=0;j<accountsColSize[i];j++){
            sum=sum+accounts[i][j];
        }
        if(sum>maxWelth){
            maxWelth=sum;
        }
    }
    return maxWelth;
}
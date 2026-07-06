class Solution {
    public int firstMissingPositive(int[] array) {
        int i=0;
   while(i<array.length){
    int current= array[i]-1;
    if( array[i]>0 && array[i]<array.length && array[i]!= array[current])
    {
        int temp= array[current];
        array[current]=array[i];
        array[i]=temp;
    }
    else{
        i++;
    }
   }
    for(int j=0;j<array.length;j++)
    {
     if(j+1 != array[j])
     {
     return j+1;
     }
    
    }
    return array.length +1;
    
    
   
}
}


    
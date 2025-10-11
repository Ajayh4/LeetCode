class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int size=energy.length;
        for(int i=0;i<k;i++)
        {
            int egy=0,ind=size-1-i;
            while(ind>=0)
            {
                egy+=energy[ind];
                energy[ind]=egy;
                ind-=k;
            }
        }
        int maximumEnergy=energy[0];
        for(int i=0;i<size;i++)
        {
            maximumEnergy=Math.max(maximumEnergy,energy[i]);
        }
        return maximumEnergy;
    }
}
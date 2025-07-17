class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0,ans=0;
        while(i<players.length && j<trainers.length)
        {
            if(players[i]<=trainers[j])
            {
                i+=1;
                j+=1;
                ans+=1;
            }
            else
            j+=1;
        }
        return ans;
    }
}
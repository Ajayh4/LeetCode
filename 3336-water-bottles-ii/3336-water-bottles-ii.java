class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=0,t=numBottles;
        while(numBottles>=numExchange)
        {
            numBottles-=numExchange;
            numExchange+=1;
            numBottles+=1;
            ans+=1;
        }
        return t+ans;
    }
}
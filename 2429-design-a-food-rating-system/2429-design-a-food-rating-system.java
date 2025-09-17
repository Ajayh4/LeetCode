class FoodRatings {
    private class Review
    {
        String food;
        String cuisine;
        int rating;
        Review(String food,String cuisine,int rating)
        {
            this.food=food;
            this.cuisine=cuisine;
            this.rating=rating;
        }
    }
    HashMap<String,Review> hm;
    HashMap<String,PriorityQueue<Review>> ctr;
    HashMap<String,String> fc;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        hm=new HashMap<>();
        ctr=new HashMap<>();
        fc=new HashMap<>();
        for(int i=0;i<foods.length;i++)
        {
            Review review=new Review(foods[i],cuisines[i],ratings[i]);
            hm.put(foods[i],review);
            fc.put(foods[i],cuisines[i]);
            if(!ctr.containsKey(cuisines[i]))
            {
                PriorityQueue<Review> pq= pq=new PriorityQueue<>((a,b) -> {
                    if(a.rating==b.rating)
                    return a.food.compareTo(b.food);
                    else
                    return b.rating-a.rating;
                });
                ctr.put(cuisines[i],pq);
            }
            ctr.get(cuisines[i]).add(review);
        }
    }
    
    public void changeRating(String food, int newRating) {
        if(hm.containsKey(food))
        {
            Review review=hm.get(food);
            String cuisine=fc.get(food);
            PriorityQueue<Review> pq=ctr.get(cuisine);
            pq.remove(review);
            review.rating=newRating;
            pq.add(review);
        }
    }
    
    public String highestRated(String cuisine) {
        return ctr.get(cuisine).peek().food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
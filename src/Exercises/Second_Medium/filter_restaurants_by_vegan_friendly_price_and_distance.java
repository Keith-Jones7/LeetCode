package Exercises.Second_Medium;
import java.util.*;
//1333 餐厅过滤器
public class filter_restaurants_by_vegan_friendly_price_and_distance {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Rest> list = new ArrayList<>();
        for (int[] restaurant : restaurants) {
            int id = restaurant[0];
            int rating = restaurant[1];
            int vegan = restaurant[2];
            int price = restaurant[3];
            int distance = restaurant[4];
            if (!(vegan == 0 && veganFriendly == 1) && price <= maxPrice && distance <= maxDistance) {
                list.add(new Rest(id, rating));
            }
        }
        list.sort((o1, o2) -> {
            if (o1.rating == o2.rating) {
                return o2.id - o1.id;
            } else {
                return o2.rating - o1.rating;
            }
        });
        List<Integer> ans = new ArrayList<>();
        for (Rest rest : list) {
            ans.add(rest.id);
        }
        return ans;
    }
}
class Rest {
    int id;
    int rating;
    public Rest(int id, int rating) {
        this.id = id;
        this.rating = rating;
    }
}

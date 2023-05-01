package Exercises.Second_Medium;
//384 打乱数组
public class shuffle_an_array {
    int[] initial;
    int len;
    int[] _shuffle;
    public shuffle_an_array(int[] nums){
        initial = nums.clone();
        _shuffle = nums.clone();
        len = nums.length;
    }
    public int[] reset(){
        _shuffle = initial.clone();
        return _shuffle;
    }
    public int[] shuffle(){
        for(int i = 0; i < len; i++){
            int rand = (int)(Math.random() * len);
            int temp = _shuffle[i];
            _shuffle[i] = _shuffle[rand];
            _shuffle[rand] = temp;
        }
        return _shuffle;
    }
}

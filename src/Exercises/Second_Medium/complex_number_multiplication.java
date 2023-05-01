package Exercises.Second_Medium;
//537 复数乘法
public class complex_number_multiplication {
    public String complexNumberMultiply(String num1, String num2) {
        return ComplexNum.multi(new ComplexNum(num1), new ComplexNum(num2)).toString();
    }

}
class ComplexNum{
    int real;
    int imaginary;
    public ComplexNum(String num){
        String[] nums = num.split("\\+");
        this.real = Integer.parseInt(nums[0]);
        this.imaginary = Integer.parseInt(nums[1].substring(0, nums[1].length() - 1));
    }
    public ComplexNum(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public static ComplexNum multi(ComplexNum num1, ComplexNum num2) {
        int imaginary_multi = - (num1.imaginary * num2.imaginary);
        return new ComplexNum(num1.real * num2.real + imaginary_multi, num1.real * num2.imaginary + num1.imaginary * num2.real);
    }
    public String toString(){
        return String.valueOf(this.real) + '+' + this.imaginary + 'i';
    }
}

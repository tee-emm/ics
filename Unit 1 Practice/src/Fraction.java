public class Fraction
{
    private int num;
    private int den;


    /*
    Given the class declaration for a Fraction outlined below, complete the definition for the following instance
method of a Fraction class: public gcf() The method should return the greatest common factor of the
numerator and denominator. For example, if the fraction were 18/24, the gcf would be 6.
     */
    public int gcf()
    {
        for(int cf = Math.min(num, den); cf>= 1; cf--){
            if (num % cf == 0 && den % cf == 0){
                return cf;
            }
        }

        return -1;

    }

    public static void main(String args[]){
        Fraction temp = new Fraction();
        temp.num = 18;
        temp.den = 24;
        System.out.println(temp.gcf());
    }
}
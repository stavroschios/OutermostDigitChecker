public class digitChecker {

        public static void main(String[] args) {

            System.out.println(hasSameLastDigit(12, 10, 11)); //return false
            System.out.println(hasSameLastDigit(99, 83, 19)); // return true
        }
        public static boolean hasSameLastDigit(int number1, int number2,int number3) {
            if ((isValid(number1) == true) && (isValid(number2) == true) && (isValid(number3) == true)) {
                int rightmostn1 = number1 % 10;
                int rightmostn2 = number2 % 10;
                int rightmostn3 = number3 % 10;

                if ((rightmostn1 == rightmostn2) || (rightmostn1 == rightmostn3) || (rightmostn2 == rightmostn3)) {

                    return true;
                } else
                    return false;
            }
            else
                return false;
        }
        public static boolean isValid(int validNumber){
            if (validNumber >= 10 && validNumber <= 1000) {
                return true;
            }
            else
                return false;
        }
    }



public class FizzBuzz {
    private int num;

    public FizzBuzz() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void fizzBuzz() {
        for (int number = 1; number <= this.getNum(); number++) {
            if (number % 3 != 0 && number % 5 != 0) {
                System.out.println(number);
                continue;
            }

            if (number % 3 == 0) {
                System.out.print("Fizz");
            }

            if (number % 5 == 0) {
                System.out.print("Buzz");
            }

            System.out.println();
        }
    }
}

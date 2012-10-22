package chapter.four.excercises;

public enum Money {
    ONE_DOLLAR, TWO_DOLLAR, FIVE_DOLLAR, TEN_DOLLAR, TWENTY_DOLLAR;

    public void choose(Money money) {
        switch (money) {
            case ONE_DOLLAR:
                System.out.println("One Dollar");
                break;
            case TWO_DOLLAR:
                System.out.println("Two Dollars");
                break;
            case FIVE_DOLLAR:
                System.out.println("Five Dollars");
                break;
            case TEN_DOLLAR:
                System.out.println("Ten Dollars");
                break;
            case TWENTY_DOLLAR:
                System.out.println("Twenty Dollars");
        }
    }
}

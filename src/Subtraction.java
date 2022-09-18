public class Subtraction implements Operation{
    public double firstItem;
    public double secondItem;
    public double answer;

    public Subtraction(double a, double b)
    {
        this.firstItem = a;
        this.secondItem = b;
    }
    @Override
    public void doOperate(){
        this.answer = firstItem-secondItem;
    }

    @Override
    public void getResult() {
        System.out.print("\nAnswer: " + this.answer);
    }

    public void getOperationName() {
        System.out.print("\nOperation: "+Subtraction.class.getName());
    }
    @Override
    public void setFirstItem(double a) {
        this.firstItem = a;
    }

    @Override
    public void setSecondItem(double b) {
        this.secondItem = b;
    }
}

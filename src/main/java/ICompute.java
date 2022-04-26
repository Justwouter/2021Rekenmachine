interface ICompute{
    public abstract int compute(int num1, int num2);
}

class PlusCompute implements ICompute{

    @Override
    public int compute(int num1, int num2) {
        return num1+num2;
    }

}
class MultiplyCompute implements ICompute{

    @Override
    public int compute(int num1, int num2) {
        return num1*num2;
    }

}
class DevideCompute implements ICompute{

    @Override
    public int compute(int num1, int num2) {
        return num1/num2;
    }

}
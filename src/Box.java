public class Box<A, B, C>
{
    private A item1;
    private B item2;
    private C item3;

    public Box(A item1, B item2, C item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    float sumOfNums()
    {
        float sum = 0;

        if (item1 instanceof Number) {
            sum += ((Number) item1).floatValue();
        }
        if (item2 instanceof Number) {
            sum += ((Number) item2).floatValue();
        }
        if (item3 instanceof Number) {
            sum += ((Number) item3).floatValue();
        }
        return sum;
    }

}

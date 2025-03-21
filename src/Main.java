public class Main {
    public static void main(String[] args)
    {
        Box box1 = new Box(1, 1.5, "f");
        Box box2 = new Box(3, 0, "f");
        Box box3 = new Box("КАКОЙЖЕЯКРАСИВЫЙ", 5, "f");
        System.out.println(box1.sumOfNums() + box2.sumOfNums() + box3.sumOfNums());
    }
}
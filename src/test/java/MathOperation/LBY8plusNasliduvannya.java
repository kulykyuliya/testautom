package MathOperation;

public class LBY8plusNasliduvannya extends LBY8plus {
    int course = 1;
    public LBY8plusNasliduvannya (int height , String name, int course) {
        super(height, name);
        this.course = course;


    }

    void tell () {
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }

}

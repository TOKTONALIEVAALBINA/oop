public class Square {

    int a;
    int b;
    int c;


    public double square (int a, int b, int c){
        float d = (a+b+c)/2.f;
        float e = (float) Math.sqrt(d*(d-a)*(d-b)*(d-c));
        return Math.sqrt(e);
    }

}

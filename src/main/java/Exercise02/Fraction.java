package Exercise02;

public class Fraction {
    private int a;
    private int b;


    public Fraction() {

    }


    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {

        return a;
    }

    public int getB() {

        return b;
    }

    @Override
    public String toString() {

        return this.a + "/" + this.b;
    }


    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    //public void Minimal(Fraction ps ){
    //  Fraction fr = new Fraction();
    // fr.a = ps.a/UCLN(Math.abs(ps.a),Math.abs(ps.b));
    // fr.b = ps.b/UCLN(Math.abs(ps.a),Math.abs(ps.b));
    //}


    public Fraction minimal() {
        int ucln = UCLN(Math.abs(this.a), Math.abs(this.b));

        return new Fraction(a/ucln, b/ucln);
    }


    public Fraction Invert() {
        int x = this.a;
        this.a = this.b;
        this.b = x;
        return new Fraction(this.a , this.b ).minimal();
    }

    public Fraction plus(Fraction another) {
        int tuso = this.getA() * another.getB() + another.getA() * this.getB();
        int mauso = this.getB() * another.getB();

        return new Fraction(tuso, mauso).minimal();
    }

    public Fraction substract(Fraction another) {
        int ts = this.getA() * another.getB() - another.getA() * this.getB();
        int ms = this.getB() * another.getB();
       return new Fraction(ts,ms).minimal();
    }

    public Fraction multiple(Fraction ps) {
        int ts = this.getA() * ps.getA();
        int ms = this.getB() * ps.getB();

        return new Fraction(ts,ms).minimal();

    }

    public Fraction divide(Fraction ps) {
        int ts = this.getA() * ps.getB();
        int ms = this.getB() * ps.getA();

        return new Fraction(ts,ms).minimal();
    }


    public Fraction plusint(int a) {
        int ts = this.getA() + a * this.getB();
        int ms = this.getB();

        return new Fraction(ts,ms).minimal();
    }

    public Fraction substractInt(int a) {
        int ts = this.getA() - a * this.getB();
        int ms = this.getB();

        return new Fraction(ts,ms).minimal();
    }

    public Fraction multipleInt(int a) {
        int ts = this.getA() * a;
        int ms = this.getB();

        return new Fraction(ts,ms).minimal();
    }

    public Fraction divideInt(int a) {
        int ts = this.getA();
        int ms = this.getB() * a;

        return new Fraction(ts,ms).minimal();
    }
}

package b2_Object类的三个方法test;

class rational implements Cloneable,Comparable<rational>{
    private int numerator;
    private int denominator;

    public static int count;

    static {
        count = 0; //静态初始化
    }
    public rational(int x,int y) {//构造方法
        setNumerator(x);
        setDenominator(y);
        count++;
    }
    public rational(int x) {
        this(x,1);
    }
    @Override
    public String toString(){
        simplify();
        if(denominator == 1)
            return String.valueOf(numerator);
        return String.format("%d/%d",numerator,denominator);
    }

    public static int gcd(int a,int b) {
        int r;
        while((r=a%b)!=0) {
            a=b;
            b=r;
        }return b;
    }
    public rational add(rational right) {
        int x = this.numerator*right.denominator+this.numerator*right.denominator;
        int y = this.denominator*right.numerator;
        return new rational(x,y);
    }
    public rational add(rational y,rational ... args) {
        rational sum = this.add(y);
        for(int i = 0;i<args.length;i++)
            sum = sum.add(args[i]);
        return sum;
    }
    public rational sub(rational right) {
        rational y = new rational(-right.numerator,right.denominator);
        return this.add(y);
    }
    public rational mul(rational right) {
        int x = this.numerator*right.denominator;
        int y = this.denominator*right.denominator;
        return new rational(x,y);
    }
    public rational div(rational right) {
        rational y = new rational(right.denominator,right.numerator);
        return this.mul(y);
    }
    private void simplify() {
        int gcd = gcd(Math.abs(numerator),Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if(denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        if(denominator != 0)
            this.denominator = denominator;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + denominator;
        result = prime * result + numerator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;   //引用相同，同一对象肯定相等
        if(obj == null) return false;  //存在和不存在比较，肯定不等
        //不同类型的对象，肯定不等
        if(getClass()!= obj.getClass()) return false;
        rational other = (rational) obj;
        rational result = other.sub(this);
        return result.numerator == 0; //有理数相减为0则相等
    }
    @Override
    public rational clone() throws CloneNotSupportedException{
        return (rational)super.clone();
    }
    @Override
    public int compareTo(rational r) {
        rational result = this.sub(r);
        return result.numerator;
    }

}
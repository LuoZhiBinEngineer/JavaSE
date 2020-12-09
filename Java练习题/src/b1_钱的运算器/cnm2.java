package b1_钱的运算器;

class Money {
    private float ho;

    public float add(float a,float b) {
        return a+b;
    }
    public float sub(float a,float b) {
        return a-b;
    }
    public float dou(float a,int n) {
        return a*n;
    }
    public float com(float a,float b) {
        if (a>b) {
            System.out.println("最大的数是"+a);
            if(a<b) {
                System.out.println("最大是数是："+b);
                if(a==b) {
                    System.out.println("这两个数相等");
                }
            }
        }
        return a;
    }

    public void format(float a) {
        int d = (int)(a);
        int b = (int)(a*10%10);
        int c = (int)(a*100%10);
        System.out.println(d+"元"+b+"角"+c+"分");
    }

    public float getHo() {
        return ho;
    }
    public void setHo(float ho) {
        this.ho = ho;
    }
}

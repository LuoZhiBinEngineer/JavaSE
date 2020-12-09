package b3_各类图形的运算;

    interface Shape{
      double getArea();
      double getPerimeter();
    }

     class Rectangle implements Shape{ //矩形的运算
        private double a;
        private double b;

         @Override
         public double getArea() {
             return   a*b;
         }

         @Override
         public double getPerimeter() {
             return  2*a + 2*b;
         }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }
    }

    class Circle implements Shape{ //圆形的运算
        private double r;

        @Override
        public double getArea() {
            return Math.PI*r*r;
        }

        @Override
        public double getPerimeter() {
            return Math.PI*2*r;
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }
    }

    class Triangle implements Shape{ //三角形的运算
        private double x;
        private double y;
        private double z;

        @Override
        public double getArea() {
            if (x + y > z && x + z > y && z + y > x){
                double p = (x + y + z) / 2;
                return Math.sqrt(p * (p - x) * (p - y) * (p - z)); //海伦公式求三角形的面积
            }else {
                System.out.println("你输入的三边不能构成三角形！");
                return 0;
            }
        }

        @Override
        public double getPerimeter() {
            if (x + y > z && x + z > y && z + y >x){
                return x + y + z;
            }else {
                System.out.println("你输入的三边不能构成三角形！");
                return 0;
            }
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }


    }




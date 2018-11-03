package edu.neu.leetcode.array;

public class ComplexNumberMultiplication {
    private class Complex {
        private int a;
        private int b;

        public Complex(String complex) {
            String[] complexSplit = complex.split("\\+");
            a = Integer.valueOf(complexSplit[0]);
            b = Integer.valueOf(complexSplit[1].substring(0, complexSplit[1].length() - 1));
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public Complex multiplication(Complex complex) {
            int cpyA = this.a * complex.getA() - this.b * complex.getB();
            int cpyB = this.a * complex.getB() + this.b * complex.getA();
            this.a = cpyA;
            this.b = cpyB;
            return this;
        }

        public String getComplex() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("+");
            sb.append(this.b);
            sb.append("i");
            return sb.toString();
        }
    }

    public String complexNumberMultiply(String a, String b) {
        Complex numA = new Complex(a);
        Complex numB = new Complex(b);
        numA.multiplication(numB);
        return numA.getComplex();
    }
}

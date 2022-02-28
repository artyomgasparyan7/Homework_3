package com.company.day_18;

import com.company.valid.Validator;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;


    }

    private boolean isTriangleValid() {

        if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB))
            return true;
        return false;

    }

    public boolean check(Triangle triangle) {

        /* return triangle.isTriangleValid();*/
        return isTriangleValid();

    }

    private int isSquare() {
        if (sideA * sideA == sideB * sideB + sideC * sideC || sideC == sideB) {
            return 1; // true , if sideA is Nerqnadziq
        } else if (sideB * sideB == sideC * sideC + sideA * sideA || sideC == sideA) {
            return 2;// true , if sideB is Nerqnadziq
        } else if (sideC * sideC == sideB * sideB + sideA * sideA || sideB == sideA) {
            return 3;// true , if sideC is Nerqnadziq
        } else {
            return -1;
        }
    }

    public int perimetr() {
        int isSquare = isSquare();
        int perimetr = 0;
        switch (isSquare) {
            case 1:
                perimetr = 2 * sideB + 2 * sideC;
                break;
            case 2:
                perimetr = 2 * sideC + 2 * sideA;
                break;
            case 3:
                perimetr = 2 * sideB + 2 * sideA;
                break;
            default:
                System.out.println("triangle count is not squar");
        }
        return perimetr;
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {

            this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {

        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}

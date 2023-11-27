package lab;

import static java.lang.Math.sqrt;

public class Main {

    public static int integerTask(int A) {
        int temp_A = (A - A%10)/10;
        int new_A = (A%10)*100 + temp_A;
        return new_A;
    }

    public static float[] ifTask(float A, float B, float C) {

        float array[] = new float[2];
        if (A <= B && A <= C) {
            array[0] = A;
        } else if (B <= A && B <= C){
            array[0] = B;
        } else {
            array[0] = C;
        }


        if (A >= B && A >= C) {
            array[1] = A;
        } else if (B >= A && B >= C){
            array[1] = B;
        } else {
            array[1] = C;
        }

        return array;
    }

    public static boolean booleanTask(int A, int B, int C) {
        return ((A > 0) && (B < 0) && (C < 0)) || ((A < 0) && (B > 0) && (C < 0)) || ((A < 0) && (B < 0) && (C > 0)) ;
    }

    public static float[] caseTask(int N, float input) {
        switch (N) {
            case 1:
                float res[] = new float[3];
                res[0] = (float) ((input*sqrt(3))/6);
                res[1] = (float) ((input*sqrt(3))/3);
                res[2] = (float) ((input*input*sqrt(3))/4);
                return res;
            case 2:
                float res1[] = new float[3];
                res1[0] = (float) (2*sqrt(3)*input);
                res1[1] = (float) ((res1[0]*sqrt(3))/3);
                res1[2] = (float) ((res1[0]*res1[0]*sqrt(3))/4);
                return res1;
            case 3:
                float res2[] = new float[3];
                res2[0] = (float) (sqrt(3)*input);
                res2[1] = (float) ((res2[0]*sqrt(3))/6);
                res2[2] = (float) ((res2[0]*res2[0]*sqrt(3))/4);
                return res2;
            case 4:
                float res3[] = new float[3];
                res3[0] = (float) sqrt((4*sqrt(3)*input)/3);
                res3[1] = (float) ((res3[0]*sqrt(3))/6);
                res3[2] = (float) ((res3[0]*sqrt(3))/3);
                return res3;
            default:
                float res4[] = new float[3];
                res4[0] = res4[1] = res4[2] = 0;
                return res4;
        }

    }

    public static float[] whileTask(int A) {
        float sum = 0f;
        float K = 1f;
        while (sum < A) {
            sum += 1/K;
            K+=1;
        }
        float res[] = new float[2];
        res[0] = K-1;
        res[1] = sum;

        return res;

    }


    public static void main(String args[]) {



        // Тестування програми
        //1) Integer task

        //input - 213, output - 321;
        // input - 761, output - 176
        System.out.println("---------------------Integer task-------------------------");
        System.out.println("input - 321, output - " + integerTask(321) );
        System.out.println("input - 761, output - " + integerTask(761));
        System.out.println("----------------------------------------------------------");

        //2) If task
        //input - -3, 0, 2.5f,  output - -3, 2.5;
        // input -  21, 9, 18,   output - 9, 21
        System.out.println("---------------------If task------------------------------");
        System.out.println("input - -3, 0, 2.5f, output - ");
        float res[] = new float[2];
        res = ifTask(-3,0,2.5f);
        for(int i = 0; i < 2; i++){
            System.out.println(res[i]);
        }
        System.out.println("input - 21, 9, 18, output - ");
        float res1[] = ifTask(21,9,18);
        for(int i = 0; i < 2; i++){
            System.out.println(res1[i]);
        }
        System.out.println("----------------------------------------------------------");


        //4) Boolean Task
        // input - -3, 5, -2, output - true;
        // input - 1, 3, -1, output - false
        System.out.println("---------------------Boolean task------------------------------");
        System.out.println("input - -3, 5, -2, output - " + booleanTask(-3,5,-2));
        System.out.println("input - 1, 3, -1, output - " + booleanTask(1,3,-1));
        System.out.println("----------------------------------------------------------");

        //5)Case task
        // input - 1, 2, output - 0.57735, 1.15470, 1.73205;
        // input - 2, 2, output - 6.92820, 4.0, 20.78460;
        // input - 3, 2, output - 3.46410, 1.0, 5.19615;
        // input - 4, 2, output - 2.14914, 0.62040, 1.24080;
        // input - 5, 2, output - 0.0, 0.0, 0.0
        System.out.println("---------------------Case task------------------------------");
        System.out.println("input - 1,2, output - ");
        float res2[] = new float[3];
        res2 = caseTask(1,2);
        System.out.println(res2[0]);
        System.out.println(res2[1]);
        System.out.println(res2[2]);
        System.out.println();
        System.out.println("input - 2,2, output - ");
        float res3[] = new float[3];
        res3 = caseTask(2,2);
        System.out.println(res3[0]);
        System.out.println(res3[1]);
        System.out.println(res3[2]);
        System.out.println();
        System.out.println("input - 3,2, output - ");
        float res4[] = new float[3];
        res4 = caseTask(3,2);
        System.out.println(res4[0]);
        System.out.println(res4[1]);
        System.out.println(res4[2]);
        System.out.println();
        System.out.println("input - 4,2, output - ");
        float res5[] = new float[3];
        res5 = caseTask(4,2);
        System.out.println(res5[0]);
        System.out.println(res5[1]);
        System.out.println(res5[2]);
        System.out.println();
        System.out.println("input - 5,2, output - ");
        float res6[] = new float[3];
        res6 = caseTask(5,2);
        System.out.println(res6[0]);
        System.out.println(res6[1]);
        System.out.println(res6[2]);
        System.out.println("----------------------------------------------------------");

        //6) While Task
        //input - 2, output - 4.0, 2.0833;
        //input - 3, output - 11.0, 3.019
        System.out.println("---------------------While task------------------------------");
        System.out.println("input - 2, output - ");
        float res7[] = whileTask(2);
        System.out.println(res7[0]);
        System.out.println(res7[1]);
        System.out.println();
        System.out.println("input - 3, output - ");
        float res8[] = whileTask(3);
        System.out.println(res8[0]);
        System.out.println(res8[1]);
        System.out.println("----------------------------------------------------------");

    }
}

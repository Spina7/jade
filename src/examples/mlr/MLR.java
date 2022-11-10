package examples.mlr;

import java.util.ArrayList;
import java.lang.Math;

public class MLR {
    ArrayList<Double> ds_Xi1 = new ArrayList<Double>(); // array of r&d values
    ArrayList<Double> ds_Xi2 = new ArrayList<Double>(); // array of marketing spend values
    ArrayList<Double> ds_Yi = new ArrayList<Double>(); // array of profit values

    // function to add the data to the arrays
    public MLR() {
        addData();
    }

    // function to calculate B0
    public double wrtBzero() {
        double result = 0;
        double numerator = 0;
        double denominator = 0;
        numerator = ((sumYi() * sumX2i1() * sumX2i2()) + (sumXi1() * sumXi1Xi2() * sumXi2Yi())
                + (sumXi2() * sumXi1Yi() * sumXi1Xi2()))
                - ((sumXi2Yi() * sumX2i1() * sumXi2()) + (sumXi1Xi2() * sumXi1Xi2() * sumYi())
                        + (sumX2i2() * sumXi1Yi() * sumXi1()));
        denominator = DS();
        result = numerator / denominator;
        return result;
    }

    // function to calculate B1
    public double wrtBone() {
        double result = 0;
        double numerator = 0;
        double denominator = 0;
        numerator = ((ds_Xi1.size() * sumXi1Yi() * sumX2i2()) + (sumYi() * sumXi1Xi2() * sumXi2())
                + (sumXi2() * sumXi1() * sumXi2Yi()))
                - ((sumXi2() * sumXi1Yi() * sumXi2()) + (sumXi2Yi() * sumXi1Xi2() * ds_Xi1.size())
                        + (sumX2i2() * sumXi1() * sumYi()));
        denominator = DS();
        result = numerator / denominator;
        return result;
    }

    // function to calculate B2
    public double wrtBtwo() {
        double result = 0;
        double numerator = 0;
        double denominator = 0;
        numerator = ((ds_Xi1.size() * sumX2i1() * sumXi2Yi()) + (sumXi1() * sumXi1Yi() * sumXi2())
                + (sumYi() * sumXi1() * sumXi1Xi2()))
                - ((sumXi2() * sumX2i1() * sumYi()) + (sumXi1Xi2() * sumXi1Yi() * ds_Xi1.size())
                        + (sumXi2Yi() * sumXi1() * sumXi1()));
        denominator = DS();
        result = numerator / denominator;
        return result;
    }

    // function to get the determinat of the system
    public double DS() {
        return ((ds_Xi1.size() * sumX2i1() * sumX2i2()) + (sumXi1() * sumXi1Xi2() * sumXi2())
                + (sumXi2() * sumXi1() * sumXi1Xi2()))
                - ((sumXi2() * sumX2i1() * sumXi2()) + (sumXi1Xi2() * sumXi1Xi2() * ds_Xi1.size())
                        + (sumX2i2() * sumXi1() * sumXi1()));
    }

    // function to calculate the sum of Xi1^2 values
    public double sumX2i1() {
        double val = 0;
        for (int it = 0; it < ds_Xi1.size(); it++) {
            val += Math.pow(ds_Xi1.get(it), 2);
        }
        return val;
    }

    // function to calculate the sum of Xi2^2 values
    public double sumX2i2() {
        double val = 0;
        for (int it = 0; it < ds_Xi2.size(); it++) {
            val += Math.pow(ds_Xi2.get(it), 2);
        }
        return val;
    }

    // function to calculate the sum of Xi1 * Xi2 values
    public double sumXi1Xi2() {
        double val = 0;
        for (int it = 0; it < ds_Xi1.size(); it++) {
            val += ds_Xi1.get(it) * ds_Xi2.get(it);
        }
        return val;
    }

    // function to calculate the sum of Xi2 * Yi values
    public double sumXi2Yi() {
        double val = 0;
        for (int it = 0; it < ds_Xi2.size(); it++) {
            val += ds_Xi2.get(it) * ds_Yi.get(it);
        }
        return val;
    }

    // function to calculate the sum of Xi1 * Yi values
    public double sumXi1Yi() {
        double val = 0;
        for (int it = 0; it < ds_Xi1.size(); it++) {
            val += ds_Xi1.get(it) * ds_Yi.get(it);
        }
        return val;
    }

    // function to calculate the sum of all Xi1 values
    public double sumXi1() {
        double val = 0;
        for (int it = 0; it < ds_Xi1.size(); it++) {
            val += ds_Xi1.get(it);
        }
        return val;
    }

    // function to calculate the sum of all Xi2 values
    public double sumXi2() {
        double val = 0;
        for (int it = 0; it < ds_Xi2.size(); it++) {
            val += ds_Xi2.get(it);
        }
        return val;
    }

    // function to calculate the sum of all Yi values
    public double sumYi() {
        double val = 0;
        for (int it = 0; it < ds_Yi.size(); it++) {
            val += ds_Yi.get(it);
        }
        return val;
    }

    // function to add data to the arrays
    public void addData() {
        // r&d values as Xi1
        ds_Xi1.add(165349.2);
        ds_Xi1.add(162597.7);
        ds_Xi1.add(153441.51);
        ds_Xi1.add(144372.41);
        ds_Xi1.add(142107.34);
        ds_Xi1.add(131876.9);
        ds_Xi1.add(134615.46);
        ds_Xi1.add(130298.13);
        ds_Xi1.add(120542.52);
        ds_Xi1.add(123334.88);
        ds_Xi1.add(101913.08);
        ds_Xi1.add(100671.96);
        ds_Xi1.add(93863.75);
        ds_Xi1.add(91992.39);
        ds_Xi1.add(119943.24);
        ds_Xi1.add(114523.61);
        ds_Xi1.add(78013.11);
        ds_Xi1.add(94657.16);
        ds_Xi1.add(91749.16);
        ds_Xi1.add(86419.7);
        ds_Xi1.add(76253.86);
        ds_Xi1.add(78389.47);
        ds_Xi1.add(73994.56);
        ds_Xi1.add(67532.53);
        ds_Xi1.add(77044.01);
        ds_Xi1.add(64664.71);
        ds_Xi1.add(75328.87);
        ds_Xi1.add(72107.6);
        ds_Xi1.add(66051.52);
        ds_Xi1.add(65605.48);
        // marketing spedn as Xi2
        ds_Xi2.add(471784.1);
        ds_Xi2.add(443898.53);
        ds_Xi2.add(407934.54);
        ds_Xi2.add(383199.62);
        ds_Xi2.add(366168.42);
        ds_Xi2.add(362861.36);
        ds_Xi2.add(127716.82);
        ds_Xi2.add(323876.68);
        ds_Xi2.add(311613.29);
        ds_Xi2.add(304981.62);
        ds_Xi2.add(229160.95);
        ds_Xi2.add(249744.55);
        ds_Xi2.add(249839.44);
        ds_Xi2.add(252664.93);
        ds_Xi2.add(256512.92);
        ds_Xi2.add(261776.23);
        ds_Xi2.add(264346.06);
        ds_Xi2.add(282574.31);
        ds_Xi2.add(294919.57);
        ds_Xi2.add(0.00);
        ds_Xi2.add(298664.47);
        ds_Xi2.add(299737.29);
        ds_Xi2.add(303319.26);
        ds_Xi2.add(304768.73);
        ds_Xi2.add(140574.81);
        ds_Xi2.add(137962.62);
        ds_Xi2.add(134050.07);
        ds_Xi2.add(353183.81);
        ds_Xi2.add(118148.2);
        ds_Xi2.add(107138.38);
        // profit values as Yi
        ds_Yi.add(192261.83);
        ds_Yi.add(191792.06);
        ds_Yi.add(191050.39);
        ds_Yi.add(182901.99);
        ds_Yi.add(166187.94);
        ds_Yi.add(156991.12);
        ds_Yi.add(156122.51);
        ds_Yi.add(155752.6);
        ds_Yi.add(152211.77);
        ds_Yi.add(149759.96);
        ds_Yi.add(146121.95);
        ds_Yi.add(144259.4);
        ds_Yi.add(141585.52);
        ds_Yi.add(134307.35);
        ds_Yi.add(132602.65);
        ds_Yi.add(129917.04);
        ds_Yi.add(126992.93);
        ds_Yi.add(125370.37);
        ds_Yi.add(124266.9);
        ds_Yi.add(122776.86);
        ds_Yi.add(118474.03);
        ds_Yi.add(111313.02);
        ds_Yi.add(110352.25);
        ds_Yi.add(108733.99);
        ds_Yi.add(108552.04);
        ds_Yi.add(107404.34);
        ds_Yi.add(105733.54);
        ds_Yi.add(105008.31);
        ds_Yi.add(103282.38);
        ds_Yi.add(101004.64);
    }
}
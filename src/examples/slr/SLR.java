package examples.slr;

import java.util.ArrayList;
import java.lang.Math;

public class SLR {
    ArrayList<Double> ds_X = new ArrayList<Double>(); // R&D SPEND array
    ArrayList<Double> ds_Y = new ArrayList<Double>(); // PROFIT array

    public SLR() {
        addData();
    }

    // function to calcualte B1
    public double wrtBOne() {
        double result = 0;
        double numerator = 0;
        double denominator = 0;
        numerator = ds_X.size() * sumXiYi() - sumXi() * sumYi();
        numerator = Math.round(numerator * 100.0) / 100d;
        denominator = ds_X.size() * sumPowerXi() - sumXi() * sumXi();
        denominator = Math.round(denominator * 100.0) / 100d;

        result = numerator / denominator;
        result = Math.round(result * 100.0) / 100d;

        return result;
    }

    // function to calcualte B0
    public double wrtBZero() {
        double result = 0;
        double numerator = 0;
        double denominator = 0;

        numerator = sumPowerXi() * sumYi() - sumXi() * sumXiYi();
        numerator = Math.round(numerator * 100) / 100d;
        denominator = ds_X.size() * sumPowerXi() - sumXi() * sumXi();
        denominator = Math.round(denominator * 100) / 100d;

        result = numerator / denominator;
        result = Math.round(result * 100) / 100d;
        return result;
    }

    // function to calculate the total value of the sum Xi * Yi
    public double sumXiYi() {
        double val = 0;
        for (int i = 0; i < ds_X.size(); i++) {
            val += ds_X.get(i) * ds_Y.get(i);
        }
        return val;

    }

    // function to calcualte the value of the sum of Xi
    public double sumXi() {
        double val = 0;
        for (int i = 0; i < ds_X.size(); i++) {
            val += ds_X.get(i);
        }
        return val;
    }

    // function to calcualte the value of the sum of Yi
    public double sumYi() {
        double val = 0;
        for (int i = 0; i < ds_Y.size(); i++) {
            val += ds_Y.get(i);
        }
        return val;
    }

    // function to calcualte the value of the sum of Xi^2
    public double sumPowerXi() {
        double val = 0;
        for (int i = 0; i < ds_X.size(); i++) {
            val += (double) Math.pow(ds_X.get(i), 2);
        }
        return val;
    }

    // function to add data into arrays
    public void addData() {
        // profit values
        ds_Y.add(192261.83);
        ds_Y.add(191792.06);
        ds_Y.add(191050.39);
        ds_Y.add(182901.99);
        ds_Y.add(166187.94);
        ds_Y.add(156991.12);
        ds_Y.add(156122.51);
        ds_Y.add(155752.6);
        ds_Y.add(152211.77);
        ds_Y.add(149759.96);
        ds_Y.add(146121.95);
        ds_Y.add(144259.4);
        ds_Y.add(141585.52);
        ds_Y.add(134307.35);
        ds_Y.add(132602.65);
        ds_Y.add(129917.04);
        ds_Y.add(126992.93);
        ds_Y.add(125370.37);
        ds_Y.add(124266.9);
        ds_Y.add(122776.86);
        ds_Y.add(118474.03);
        ds_Y.add(111313.02);
        ds_Y.add(110352.25);
        ds_Y.add(108733.99);
        ds_Y.add(108552.04);
        ds_Y.add(107404.34);
        ds_Y.add(105733.54);
        ds_Y.add(105008.31);
        ds_Y.add(103282.38);
        ds_Y.add(101004.64);
        // r&d spend values
        ds_X.add(165349.2);
        ds_X.add(162597.7);
        ds_X.add(153441.51);
        ds_X.add(144372.41);
        ds_X.add(142107.34);
        ds_X.add(131876.9);
        ds_X.add(134615.46);
        ds_X.add(130298.13);
        ds_X.add(120542.52);
        ds_X.add(123334.88);
        ds_X.add(101913.08);
        ds_X.add(100671.96);
        ds_X.add(93863.75);
        ds_X.add(91992.39);
        ds_X.add(119943.24);
        ds_X.add(114523.61);
        ds_X.add(78013.11);
        ds_X.add(94657.16);
        ds_X.add(91749.16);
        ds_X.add(86419.7);
        ds_X.add(76253.86);
        ds_X.add(78389.47);
        ds_X.add(73994.56);
        ds_X.add(67532.53);
        ds_X.add(77044.01);
        ds_X.add(64664.71);
        ds_X.add(75328.87);
        ds_X.add(72107.6);
        ds_X.add(66051.52);
        ds_X.add(65605.48);

    }

}

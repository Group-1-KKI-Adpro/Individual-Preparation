package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {
    
    public double add(double o1, double o2) {
        // TODO: Implement me properly!
        return o1 + o2;
    }

    public double subtract(double o1, double o2) {
        return o1 - o2;
    }

    public double multiply(double o1, double o2) {
        return o1 * o2;
    }

    public double divide(double o1, double o2) {
        return o1/o2;
    }

    public double exponent(double o1, int n) {
        double res = 1.0;
        int exp;
        double base;
        int bit1 = 1; // For now this is an attempt to fix the PMD
        //Edge Cases
        if (n == 0) return 1.0;
        if (n < 0 && o1 == 0.0) {
            throw new IllegalArgumentException("0 cannot be raised to a negative power.");
        }

        //Base and Exp Setup
        if (n < 0) {
            base = 1.0 / o1;
            exp = -n;
        } else {
            base = o1;
            exp = n;
        }

        //Binary Exponentiation
        while (exp > 0) {
            if ((exp & bit1) == bit1) {
                res *= base;
            }
            base *= base;
            exp >>= 1;
        }

        return res;
    }
}

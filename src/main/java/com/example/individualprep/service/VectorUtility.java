package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {

    public double[] add(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Input vectors cannot be null.");
        }
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] - v2[i];
        }
        return result;
    }


    public double[] multiply(double[] v1, int x) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double dotProduct(double[] v1, double[] v2) {
        // valid dot product requires vectors of equal length
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vector lengths must be equal for dot product.");
        }

        double sum = 0.0;
        for (int i = 0; i < v1.length; i++) {
            sum += v1[i] * v2[i];
        }
        return sum;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        double sum = 0.0;

        for (double value : v1) {
            sum += value * value;
        }

        return Math.sqrt(sum);
    }
}
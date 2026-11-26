package ru.qa.study.module2;

public class VariablesDemo {
    public static void main(String[] args) {
        int statusCode = 200;
        double responseTime = 0.45;
        boolean isSuccess = true;
        char grade = 'A';
        String endpoint = "/api/v1/users";
        Integer retryCount = null;

        final int MAX_RETRIES = 3;

        int half = 5 / 2;
        double exactHalf = 5 / 2.0;

        System.out.println("Endpoint: " + endpoint + ", HTTP: " + statusCode);
        System.out.println("Time: " + responseTime + "s, success: " + isSuccess + ", grade: " + grade);
        System.out.println("Retry: " + retryCount + " of " + MAX_RETRIES);
        System.out.println("5 / 2 = " + half + "| 5 / 2.0 = "+ exactHalf);
    }
}

package com.interviewbit.strings;

public class NumberToWords {
    public static void main(String[] args) {
        long n = 123456789;
        System.out.println(numberToWords(n));

    }

    static String numberToWords(long n) {
        long limit = 1000000000000L, curr_hum, t = 0;
        if (n == 0) return "zero";
        String multiplier[] = {"", "Trillion", "Billion", "Million", "thousand"};
        String first_twenty[] = {
                "", "one", "two", "three",
                "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String tens[] = {"", "twenty", "thirty",
                "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety"};
        if (n < 20L) return first_twenty[(int) n];
        String answer = "";
        for (long i = n; i > 0; i = i % limit, limit = limit / 1000) {
            curr_hum = i / limit;
            while (curr_hum == 0) {
                i = i % limit;
                limit = limit / 1000;
                curr_hum = i / limit;
                ++t;
            }
            if (curr_hum > 99) {
                answer += first_twenty[(int) curr_hum / 100] + "-hundred-";
            }
            curr_hum = curr_hum % 100;
            if (curr_hum > 0 && curr_hum < 20) {
                answer += (first_twenty[(int) curr_hum] + "-");
            } else if (curr_hum % 10 == 0 && curr_hum != 0)
                answer += (tens[(int) curr_hum / 10 - 1] + "-");
            else if (curr_hum > 20 && curr_hum < 100)
                answer += (tens[(int) curr_hum / 10 - 1] + "-"
                        + first_twenty[(int) curr_hum % 10]
                        + " ");
            if (t < 4)
                answer += (multiplier[(int) ++t] + "-");
        }
        return (answer);

    }
}

package com.dayakar;

import java.io.*;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(String.format("%.6f",3.4));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);
        System.out.println("Result "+ result);
      //  bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();

    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int primarySum = 0;
        int secondarySum=0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j <= arr.size(); j++) {
                //left diagonal
                if (i == j) {
                    primarySum += arr.get(i).get(j);
                }
                //right diagonal

                if (j==arr.size()-1-i){
                    secondarySum +=arr.get(i).get(j);
                }
            }

        }

        return Math.abs((primarySum-secondarySum));
    }
}

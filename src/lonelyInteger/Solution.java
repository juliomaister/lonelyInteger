package lonelyInteger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
    
        List<Integer> a = Arrays.asList(1,2,3,4,3,2,1);

        int result = Result.lonelyinteger(a);

        System.out.println(String.valueOf(result));
    }
}

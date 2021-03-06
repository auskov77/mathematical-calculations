package ru.itsjava.yandex.contest;

import java.io.*;

public class Task9 {
    private static final String FILE_INPUT = "input.txt";
    private static final String FILE_OUTPUT = "output.txt";
    private static BufferedReader bufferedReader = null;
    private static BufferedWriter bufferedWriter = null;
    public static void main(String[] args) throws Exception {
        init();
        run();
        close();
    }

    private static void init() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(FILE_INPUT));
        bufferedWriter = new BufferedWriter(new FileWriter(FILE_OUTPUT));
    }

    private static void close() throws IOException {
        bufferedWriter.close();
        bufferedReader.close();
    }

    private static void run() throws IOException {
        int k, ki, i, j;

        read();
        k = buffInt;
        for (i = 0; i < k; ++i){
            read();
            ki = buffInt;
            for(j = 0; j < ki; ++j){
                read();
                ++sort[buffInt];
            }
        }
        for(buffInt = 0; buffInt < MAX_NUMBER; ++buffInt) {
            intToChars();
            for (j = 0; j < sort[buffInt]; ++j)
                write();
        }
    }

    private static final int MAX_NUMBER = 101;
    private static final int MAX_BUFF_SIZE = 5;

    private static final int[] sort = new int[MAX_NUMBER];
    private static final char[] buffChars = new char[MAX_BUFF_SIZE];
    private static int buffInt = 0;
    private static int count = 0;
    private static int local = 0;

    private static void read() throws IOException {
        count = 0;
        buffInt = 0;
        local = 1;

        while ((local > 0) && (local != '\n') && (local != ' ')) {
            local = bufferedReader.read();
            if (local >= '0' && local <= '9')
                buffChars[count++] = (char) local;
        }
        local = count;
        for(count = 0; count < local; count++)
            buffInt = (buffInt * 10) + (buffChars[count] - '0');
    }

    private static void write() throws IOException {
        count = 0;
        while (count < MAX_BUFF_SIZE-1) {
            if (buffChars[count++] != '0') break;
        }

        while (count < MAX_BUFF_SIZE) {
            bufferedWriter.write(buffChars[count++]);
        }

        bufferedWriter.write(' ');
    }


    private static void intToChars() {
        local = buffInt;
        count = MAX_BUFF_SIZE;
        while (count > 0) {
            buffChars[--count] = (char) ((local % 10) + '0');
            local /= 10;
        }
    }

}
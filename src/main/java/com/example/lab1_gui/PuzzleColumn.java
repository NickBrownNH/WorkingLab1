package com.example.lab1_gui;

import java.util.Random;

public class PuzzleColumn {
    private int[] col;

    public PuzzleColumn() {
        col = new int[5];
        fillCol();
    }

    private void fillCol() {
        Random rand = new Random();

        for (int i=0; i<col.length; i++) {
            col[i] = rand.nextInt(2);
        }
    }

    public String toString() {
        String output = "";
        for (int i=0; i<=col.length; i++) {
            output += col[i] + "\n";
        }
        return output;
    }

    /**
     * Returns the number of sequential 1s in the array
     * @return a String representing the number of sequential 1s in the array
     */
    public String getColClue()
    {
        String clues = "";
        int    i = 0;
        int   count = 0;
        while (i < col.length) {
            while (i < col.length && col[i] == 0)  //skip past all 0s
                i++;
            while (i < col.length && col[i] == 1) {  //counting all the 1s
                i++;
                count++;
            }
            if (count > 0)
                clues += count + "\n";
            count = 0;
        }
        return clues;
    }

    public int getValue (int index)
    {
        return col[index];
    }
}

package com.deepak.algo.onlineTest;

public class AddOne {
	
	public Integer addOne(Integer number) {
        int[] binary = convertBinary(number);
        int[] one = new int[16];
        one[one.length - 1] = 1;
        add(binary, one);
        if (number < 0) {
            binary = do2sComplement(binary);
            number = convertToDecimal(binary);
            number = -number;
        }else {
        	 number = convertToDecimal(binary);
        }
        return number;
    }

    public int[] convertBinary(Integer number) {
        int[] binary = new int[16];
        doDivision(Math.abs(number), binary, binary.length - 1);
        if (number < 0)
            return do2sComplement(binary);
        return binary;
    }

    public int[] do2sComplement(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = Math.abs(array[index] - 1);
        }
        int[] one = new int[16];
        one[one.length - 1] = 1;
        add(array, one);
        return array;
    }

    private void add(int[] array, int[] one) {
        int carry = 0;
        for (int index = array.length - 1; index >= 0; index--) {
            carry = addBit(array[index], one[index], carry, array, index);
        }
    }

    private int addBit(int i, int j, int carry, int[] array, int index) {
        int temp = i + j + carry;
        array[index] = temp % 2;
        return temp / 2;
    }

    private void doDivision(Integer number, int[] binary, int index) {
        if (number <= 1) {
            binary[index--] = number;
            return;
        }
        int mod = number % 2;
        binary[index--] = mod;
        doDivision(number / 2, binary, index);
    }

    public Integer convertToDecimal(int[] array) {
        int number = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != 0)
                number += Math.pow(2, array.length - index - 1);
        }
        return number;
    }

    public void print(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

}

package com.sample_springboot_api.sample_springboot_api.models;

public class SumResponse {
    private int sum;
    private int Val_1;
    private int Val_2;

    /**
     * @return int return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    // public void setSum(int sum) {
    //     this.sum = sum;
    // }

    public void Sum() {
        this.sum = this.Val_1 + this.Val_2;
    }

        /**
     * @return int return the Val_1
     */
    public int getVal_1() {
        return Val_1;
    }

    /**
     * @param Val_1 the Val_1 to set
     */
    public void setVal_1(int Val_1) {
        this.Val_1 = Val_1;
    }

    /**
     * @return int return the Val_2
     */
    public int getVal_2() {
        return Val_2;
    }

    /**
     * @param Val_2 the Val_2 to set
     */
    public void setVal_2(int Val_2) {
        this.Val_2 = Val_2;
    }

}

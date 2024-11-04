package BingInt;

import java.math.BigInteger;


public class BigInt {
  public static void main(String[] args){

      // this performs on 64 bits
      BigInteger first = new BigInteger("758559499393"); // this will treat that big number as a string
      BigInteger second = new BigInteger("576847548");
      // this will  add the two big number with 64bits precision
      BigInteger answer = first.add(second);
      System.out.println(answer);
  }
}

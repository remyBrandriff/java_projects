/*Written by: Brittany Brandriff and Nathan Franklin
2/2/2016    CS136 Lab 2: RSA encryption
This program can encrypt and decrypt an integer (m) using the RSA
encryption instructions found on wikipedia:
1) n = p*q
2) totient of n = (p-1)(q-1)
3) 1<e<(totient of n)   rule for e: (totient of n) % e != 0 (e is coprime to totient of n)
4) d = 1/(e(mod (totient of n)))
to encrypt:    (number to encrypt)e mod n = encryptedValue
to decrypt:      (encryptedValue)d mod n = original number
*/
import java.math.BigInteger;
import java.util.*;

public class RSA_encryption {
  public static void main(String[] args) {
    //This was the test code with given values for p and q
    //BigInteger p = new BigInteger("20");
    //BigInteger q = new BigInteger("17");

    //  randomly generates BigInteger prime values for p and q
    Random rnd = new Random();
    BigInteger p =  BigInteger.probablePrime (256, rnd);
    BigInteger q =  BigInteger.probablePrime (256, rnd);

    //  n = p*q
    BigInteger n = p.multiply(q);
    System.out.println("n = " + n);

    //  totient of n = (p-1)(q-1)
    //
    //  we had to make a BigInteger variable with value of 1 to be able to do
    //  the math with the p and q BigIntegers
    BigInteger one = new BigInteger("1");
    BigInteger totient = (p.subtract(one)).multiply(q.subtract(one));
    System.out.println("p = " + p + " q = " + q + " Totient = " + totient);

    //  value e is a prime number with value less than the value of the
    //  totient of n and coprime to the totient of n. The while loop will keep
    //  generating a value for e until the above is true for e
    BigInteger e = BigInteger.probablePrime( 256, rnd);
    while (totient.mod(e).intValue() == 0 && totient.compareTo(e) != 1){
      e = BigInteger.probablePrime( 256, rnd);
    }

    // d is the private value used for decryption of m
    BigInteger d = e.modInverse(totient);

    System.out.println("Public key is: n = " + n + " e = " + e);
    System.out.println("Private key is: n = " + n + " d = " + d);

    //  This is the number to get encrypted/decrypted
    BigInteger m = new BigInteger("65");

    BigInteger encodedM = m.modPow(e, n);
    System.out.println("Encoded message = " + encodedM);

    BigInteger decodedM = encodedM.modPow(d, n);
    System.out.println("Decoded message = " + decodedM);

    }
}

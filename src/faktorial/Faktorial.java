/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

/**
 *
 * @author gsi
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    //membuat fungsi faktorial
    public static long fact(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //contoh 5! = 5x4x3x2x1 = 120
        //fungsi fact kita isi angka 5
        System.out.println(fact(5));
    }

}

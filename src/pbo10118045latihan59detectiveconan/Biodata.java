/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan59detectiveconan;



/**
 *
 * @author Ilham
 */
public class Biodata extends Profile{

    @Override
    public int pilihan() {
        return super.pilihan(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void tampilProfile(){
        System.out.println("======Profile Karakter======");
        System.out.println("----------------------------");
        System.out.println("Nama \t: " +getNamaLengkap());
        System.out.println("Biodata\t: " +getBiodata());
    }




}

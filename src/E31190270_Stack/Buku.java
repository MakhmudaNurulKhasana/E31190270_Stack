/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package E31190270_Stack;

import java.util.Scanner;

/**
 *
 * @author Makhmuda_Nurul_Khasana
 */
public class Buku {
    //membuat varibel
    int id,tahun;
    String judul;
    Buku next;
    
    //method scanner untuk inputan angka
    public static Scanner in = new Scanner(System.in);
    //method scanner untuk inputan string
    public static Scanner str = new Scanner(System.in);
    public void input(){ //method untuk menginputkan data buku
        System.out.print("Masukkan id buku      : ");
        id=in.nextInt(); //nilai var id dari inputan
        System.out.print("Masukkan judul        : ");
        judul=str.nextLine(); //nilai var judul dari inputan
        System.out.print("Masukkan tahun terbit : ");
        tahun=in.nextInt(); //nilai var tahun dari inputan
        next=null; //nilai var next = null
    }
    public void view(){ //method untuk menampilkan data buku
        System.out.println("id buku      : "+id); //menampilkan nilai var id
        System.out.println("judul        : "+judul); //menampilkan nilai var judul
        System.out.println("tahun terbit : "+tahun); //menampilkan nilai var tahun
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu=0;
        linked st=new linked();
        while(menu!=4){ //jika pilihan menu tidak sama dengan 4
            //tampil pilihan menu
            System.out.print("1.push\n2.pop\n3.view\n4.exit\n : ");
            //menu diambil dari nomer yang diinputkan
            menu=in.nextInt();
            if(menu==1){ //jika menu yang dinput 1
                Buku baru=new Buku(); //maka membuat data buku baru
                baru.input(); //yang diambil dari inputan
                st.push(baru); //memanggil method push
            }
            //jika menu yang dipilih 2 maka memanggil method void pop
            else if(menu==2) st.pop();
            //jika menu yang dipilih 3 maka memanggil method void view
            else if(menu==3) st.view();
            //jika menu yang dipilih 4 maka keluar dari program
            else if(menu==4) System.out.println("keluar . . .");
            //jika menu yang dipilih selain angka 1-4 tampil output salah
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }
}

class linked{
    Buku top;
    public linked(){
        top=null; //inisialisasi variabel top = null
    }
    public void push(Buku a){ //method void push
        //jika top == null, isi dari top = a
        if(top==null) top=a;
        else{ //jika tidak
            //isi next dari objek a dengan top
            a.next=top;
            //ganti nilai variabel top
            //top = a
            top=a;
        }
    }
    public void pop(){ //method void pop
        //jika top == null maka tampil kosong
        if(top==null) System.out.println("kosong");
        else{ //jika tidak
            //tampil popping data
            System.out.println("Popping Data . . .");
            //panggil method view dari top
            top.view();
            //ganti nilai top, top=top.next
            top=top.next;
        }
    }
    public void view(){ //method void view
        //jika top==null, tampil kosong
        if(top==null) System.out.println("kosong");
        else{ //jika tidak
            //membuat objek ptr dengan nilai var top
            Buku ptr=top;
            //jika ptr!=null
            while(ptr!=null){
                System.out.println("- - - - -");
                //panggil method view dari objek ptr
                ptr.view();
                //ganti nilai var ptr
                //ptr = ptr.next
                ptr=ptr.next;
            }
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg34.dynamic.method.ditchpatch;

class Super{
    void meth1(){
        System.out.println("meth1");
    }
    void meth2(){
        System.out.println("Super meth2");
    }
}
class Sub extends Super{
    
    @Override
    void meth1(){
        System.out.println("sub meth2");
    }
    @Override
    void meth2(){
        System.out.println("meth3");
    }
}
public class DynamicMethodDitchpatch {

    public static void main(String[] args) {
        
//        Super superr;
//        
//        superr = new Sub();
//        superr.meth1();
//        superr.meth2();
        
        Super supe = new Sub();
        supe.meth1();
    }
    
}

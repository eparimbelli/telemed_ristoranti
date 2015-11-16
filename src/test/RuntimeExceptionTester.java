package test;

import java.io.IOException;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class RuntimeExceptionTester {
    public static void main(String[] args){

//        meth1();
        meth2();
    }
    
    //Checked Exception (Exception)
    static void meth1() throws IOException{
        throw new IOException();
    }
    
    //Unchecked Exception (RuntimeException)
    static void meth2(){
        throw new ArithmeticException();
    }

}

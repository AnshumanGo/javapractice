package com.practice.java._14exceptionhandling;

public class _6JavaExceptionHandlingWithOverriding {

    public static void main(String[] args) {

        ParentClassNoException parentClassNoExceptionOne
                = new ParentClassNoExceptionChild();
        parentClassNoExceptionOne.test();

        System.out.println("*********************");

        ParentClassNoExceptionChild parentClassNoExceptionChildOne
                = (ParentClassNoExceptionChild) parentClassNoExceptionOne;
        parentClassNoExceptionChildOne.test();

        System.out.println("*********************");

        ParentClassNoException parentClassNoExceptionTwo
                = new ParentClassNoException();
        parentClassNoExceptionTwo.test();

        System.out.println("*********************");

        ParentClassNoExceptionChild parentClassNoExceptionChildTwo
                = new ParentClassNoExceptionChild();
        parentClassNoExceptionChildTwo.test();

        System.out.println("*********************");

        ParentClassNoExceptionChild parentClassNoExceptionChildThree
                = new ParentClassNoExceptionChild();
        parentClassNoExceptionChildThree.test();

        System.out.println("*********************");

        ParentClassNoException parentClassNoExceptionThree
                = parentClassNoExceptionChildThree ;
        parentClassNoExceptionThree.test();

        System.out.println("*********************");

        ParentClassException parentClassExceptionOne
                = new ParentClassException();
        parentClassExceptionOne.test();
        parentClassExceptionOne.stub();

        System.out.println("*********************");

        ParentClassException parentClassExceptionTwo
                = new ParentClassExceptionChild();
        parentClassExceptionTwo.test();
        parentClassExceptionTwo.stub();
    }
}

class ParentClassNoException{

    void test(){
        System.out.println("ParentClassNoException test");
    }
}

class ParentClassNoExceptionChild extends ParentClassNoException{

    /*If the superclass method does not declare an exception,
    subclass overridden method cannot declare the checked exception.
    void test() throws IOException{

        System.out.println("ParentClassNoExceptionChild test checked exception IOException");
    }*/

    /*If the superclass method does not declare an exception,
    subclass overridden method cannot declare the checked exception but can declare unchecked exception. */
    @Override
    void test() throws ArithmeticException{
        System.out.println("ParentClassNoExceptionChild test");
    }
}

class ParentClassException{

    void test() throws RuntimeException{

        System.out.println("ParentClassException with Runtime Exception test");
    }

    void stub() throws RuntimeException{

        System.out.println("ParentClassException with Runtime Exception Stub");
    }
}

class ParentClassExceptionChild extends ParentClassException{

    /*//If subclass overridden method declares parent exception, it give CTE
    @Override
    void test() throws Exception {
        super.test();
    }*/

    //If subclass overridden method declares same exception
    @Override
    void test() throws RuntimeException{

        System.out.println("ParentClassExceptionChild with Runtime Exception test");
    }

    //If subclass overridden method declares sub class of exception
    @Override
    void stub() throws ArithmeticException{

        System.out.println("ParentClassExceptionChild with Runtime Exception Stub");
    }
}
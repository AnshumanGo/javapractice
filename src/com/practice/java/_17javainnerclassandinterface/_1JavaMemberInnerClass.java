package com.practice.java._17javainnerclassandinterface;

/*    Compiler generated code for java member inner class
*     import java.io.PrintStream;
    class _1JavaMemberInnerClass$Inner
    {
        final Outer this$0;
        _1JavaMemberInnerClass$Inner() {
            super();
            this$0 = Outer.this;
        }

        void msg()
        {
            System.out.println((new StringBuilder()).append("data is ")
                        .append(Outer.access$000(Outer.this)).toString());
        }
    }  */
public class _1JavaMemberInnerClass {

    private int data=30;

    class Inner{

        void msg(){
            System.out.println("data is "+data);
        }
    }

    public static void main(String args[]){

        _1JavaMemberInnerClass javaMemberInnerClass=new _1JavaMemberInnerClass();
        _1JavaMemberInnerClass.Inner inner=javaMemberInnerClass.new Inner();
        inner.msg();
    }
}
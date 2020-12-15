package com.practice.java._10javaencapsulation._1accessmodifiers._3protectedmodifier._1protectedtwo;

import com.practice.java._10javaencapsulation._1accessmodifiers._3protectedmodifier._1protectedone._1ProtectedMembersClass;

public class _1ProtectedMemberAccess extends _1ProtectedMembersClass {

    public static void main(String[] args) {

        _1ProtectedMemberAccess protectedMemberAccess
                = new _1ProtectedMemberAccess();
        protectedMemberAccess.test_1ProtectedMembersClass();
    }
}

class _1ProtectedMemberAccessTwo {

    public static void main(String[] args) {

        _1ProtectedMembersClass protectedMembersClass
                = new _1ProtectedMembersClass();
        //protectedMembersClass.test_1ProtectedMembersClass();// protected member not visible without inheritance
    }
}
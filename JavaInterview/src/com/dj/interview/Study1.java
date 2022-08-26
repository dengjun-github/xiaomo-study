package com.dj.interview;

/**
 * @author DJ
 * @className Study1
 * @Description
 * @date 2022-08-24 19:37
 */
public class Study1 {
    public static void main(String[] args) {
        Study1 study1 = new Study1();
//        int i = 0;
//        study1.inc(i);
//        i = i++;
//        System.out.println(i);
        
        Stud stud = new Stud(10);
//        System.out.println("step 0----"+stud.getAge());
        study1.inc(stud.getAge());
//        System.out.println("step 1----"+stud.getAge());
        study1.incAge(stud);
//        System.out.println("step 2----"+stud.getAge());
        study1.setNull(stud);
        stud.incAge();
        System.out.println("step 3----"+stud.getAge());
        study1.setAge0(stud);
        System.out.println("step 4----"+stud.getAge());
        
    }
    
    void inc(int i) {
        i++;
    }
    
    void incAge(Stud stud) {
        stud.incAge();
    }
    
    void setNull(Stud stud) {
        stud = null;
    }
    
    void setAge0(Stud stud) {
       stud.setAge(0);
    }
}


class Stud{
    private int age;
    
    public Stud(int age) {
        this.age = age;
    }
    
    public void incAge(){
        age++;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
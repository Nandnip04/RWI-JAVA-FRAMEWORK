package com.springcore;

public class StudentData {
    private int id;
    private String name;
    private int hindi;
    private int english;
    private int maths;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    

    public StudentData(int id, String name, int hindi, int english, int maths) {
        this.id = id;
        this.name = name;
        this.hindi = hindi;
        this.english = english;
        this.maths = maths;
    }

    public StudentData() {
    }

    public void print(){
        System.out.println("Student id:"+id+"\n"+"Student name : "+name+"\n"+"Student marks ------\n"+"Hindi : "+hindi+"\n"+"English : "+english+"\n"+"Maths : "+maths);
        int total=hindi+english+maths;
        System.out.println("Total : "+total );
        double average=total/3;
        System.out.println("Average : "+average);

        if(average>=70){
            System.out.println("A grade");
        }

        else if(average>=60 && average<70){
            System.out.println("B grade");
        }

        else if(average>=50 && average<60){
            System.out.println("C grade");
        }

        else if(average>=33 && average<50){
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}

package day34_abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;// static and final

    /*
    private static void main(String[] args) {

        System.out.println(isFriendly);

      //  isFriendly=false// you cant reassign bc its final
    }

      default void method1(){

    }

     */

    void play(); // abstract




}

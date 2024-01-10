package Zadatak5;

public class Test {
    public static void main(String[] args) {

        Trougao trougao = new Trougao(32,45,21);

        System.out.println("====================");
        System.out.println("Da li je trougao validan : " + trougao.daLiJeTrougaoValidan(trougao.getPoljeA(),trougao.getPoljeB(),trougao.getPoljeC()));

        System.out.println("====================");
        System.out.println("Obim trougla: " + trougao.obim());

        System.out.println("====================");
        System.out.println("Povrsina trougla: " + trougao.povrsina());

        System.out.println("====================");
        System.out.println("Trougao: \n" + trougao);

    }
}

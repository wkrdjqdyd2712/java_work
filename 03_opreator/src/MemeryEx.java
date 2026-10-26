public class MemeryEx {
    static int value = 50;
    int n2 = 100;

    void add(){
        int n1 = 1;
        System.out.println("add함수의 n1 : " + n1);
        //System.out.println("밖에 있는 n2 " + n2);
        int money = 0;
        if (true){
            int i = 10;
            System.out.println("i = " + 1);
            money = money + 10000;



        }
        System.out.println(money);

    }


    static void main(String[] args) {
        System.out.println("value = " + MemeryEx.value);
        //MemeryEx.add();

        MemeryEx ex = new MemeryEx();
        System.out.println(ex.n2);


    }
}

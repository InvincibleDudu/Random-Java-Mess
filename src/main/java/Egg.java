import java.time.LocalTime;

public class Egg {

    public static void main(String[] args) {
        System.out.println("早上好，现在开始做蛋饼。");
        Sync ss = new Sync();
        new Producer(ss);
        new Consumer(ss);
    }
}

class Danbing {
    int id;

    Danbing(int id) {
        this.id = id;
    }

    public String toString() {
        return "第" + (id + 1) + "个蛋饼";
    }
}

class Sync {
    int stock = 0;
    Danbing[] pastry = new Danbing[3];

    public synchronized void plus(Danbing db) {
        while (stock == pastry.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        pastry[stock] = db;
        System.out.println("开始做" + db + " 当前库存为：" + stock);
        stock++;
        System.out.println(LocalTime.now() + "++生产了蛋饼     当前库存为：" + stock);
    }

    public synchronized void minus() {
        while (stock == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        //System.out.println("当前库存为："+stock);
        stock--;
        System.out.println(LocalTime.now() + "---消费了蛋饼     当前库存为：" + stock);
    }
}

class Producer extends Thread {
    Sync ss;

    Producer(Sync ss) {
        this.ss = ss;
        start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            Danbing db = new Danbing(i);
            ss.plus(db);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Sync ss;

    Consumer(Sync ss) {
        this.ss = ss;
        start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            ss.minus();
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("营业结束！");
    }
}

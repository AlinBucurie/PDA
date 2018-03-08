public class ProdCons {

    public static void main(String[] arg) throws InterruptedException
    {
        ProducerConsumer Obj= new ProducerConsumer();

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Obj.produce();
                }

                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });


        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Obj.consuma();
                }

                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}


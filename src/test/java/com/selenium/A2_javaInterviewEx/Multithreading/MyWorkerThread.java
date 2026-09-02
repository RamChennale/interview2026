// 1. Create a subclass of Thread
static class myWorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running by extending Thread class!");
    }
}

    public static void main(String[] args) {
        // 2. Instantiate and start the thread directly
        myWorkerThread thread = new myWorkerThread();
        thread.start();
    }


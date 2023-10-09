public class Q231006 {
    class Job {
        int count = 0;

        void increament() {
            count++;
        }

        public synchronized void firstJob(Runnable job) throws InterruptedException {
            while (count == 0) {
                job.run();
                increament();
                notifyAll();
            }

        }

        public synchronized void secondJob(Runnable job) throws InterruptedException {
            while (count != 1) {
                wait();
            }
            job.run();
            increament();
            notifyAll();
        }

        public synchronized void thirdJob(Runnable job) throws InterruptedException {
            while (count != 2) {
                wait();
            }
            job.run();
        }

    }
}

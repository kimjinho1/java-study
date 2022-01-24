package review.scheduler;

public interface Scheduler {

    abstract void getNextCall();
    abstract void sendCallToAgent();
}

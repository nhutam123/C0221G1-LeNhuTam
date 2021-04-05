package bai4.baiTap.stopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;
    private long getStartTime(){
        return this.startTime;
    }
    private long getEndTime(){
        return this.endTime;
    }
    private long StopWatch(){
        return this.startTime=System.currentTimeMillis();
    }
    private void start(){
        startTime=System.currentTimeMillis();
    }
    private void stop(){
        endTime=System.currentTimeMillis();
    }
    private  long getElapsedTime(){
        return getEndTime()-getStartTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        for (int i=0;i<10000;i++){
            System.out.println("toi");
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }



}

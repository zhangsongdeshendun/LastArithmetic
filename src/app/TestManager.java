package app;

//饿汉模式
public class TestManager {

    /**
     * 饿汉模式
     */
//    private static final TestManager instance = new TestManager();
//
//    private TestManager() {
//
//    }
//
//    public static TestManager getInstance() {
//        return instance;
//    }


    /**
     * 懒汉模式
     */


//    private static TestManager instance;
//
//    private TestManager(){
//
//    }
//
//    public static TestManager getInstance(){
//        if(instance==null){
//            instance=new TestManager();
//
//        }
//
//        return instance;
//    }

    /**
     * 线程安全 1
     */

//    private static TestManager instance;
//
//    private TestManager(){
//
//    }
//
//    public static synchronized TestManager getInstance(){
//        if(instance==null){
//            instance=new TestManager();
//        }
//
//        return instance;
//    }

    /**
     * 线程安全 2
     */

//    private static volatile TestManager instance;
//
//    private TestManager(){
//
//    }
//
//    public static TestManager getInstance(){
//        if(instance==null){
//            synchronized (TestManager.class){
//                if(instance==null){
//                    instance=new TestManager();
//                }
//            }
//        }
//
//        return instance;
//    }
    /**
     * 线程安全 3
     */
//    private static class TestHolder {
//        private static final TestManager instance = new TestManager();
//    }
//
//    private TestManager() {
//
//    }
//
//    public static TestManager getInstance() {
//        return TestHolder.instance;
//    }


}

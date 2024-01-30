public class MethodShortcuts {
    public static void main(String[] args) {
        System.out.println("ATA");
        MethodShortcuts methodShortcuts = new MethodShortcuts();
        System.out.println(methodShortcuts.method1());
    }

    // cmd + arrow keys move word by word
    // ctrl + arrow keys move word by word
    public void method2(){
        System.out.println(method1());
    }

    //alt + down move between methods
    // home / end move from front of line to end of line
    public String method1(){
        FindClassThroughInitials findClassThroughInitials = new FindClassThroughInitials();
         return "Method 1 called!";
    }

    // cmd + p = view method params
    // cmd/ctrl - = fold method
    // cmd/ctrl + = unfold/expand method
    public void method3(){
//        ExecutorService service = new ThreadPoolExecutor();
    }
}

public class ClassShortcuts {
    public static void main(String[] args) {
        System.out.println("ATA");
        ClassShortcuts methodShortcuts = new ClassShortcuts();
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
    // cmd or ctrl - = fold method
    // cmd or ctrl + = unfold/expand method
    public void method3(){
//        ExecutorService service = new ThreadPoolExecutor();
    }



    /*
    * cmd + o or cntrl + n to navigate to class
    * - search for all words that match any word in class
    * - insert * to have wildcard reg expression
    * - search by initials of class name
    *
    * cmd + [ or ctrl + alt arrow key  = navigate back
    *
    *     * cntrl + o to navigate to class
     * - search for all words that match any word in class
     * - insert * to have wildcard reg expression
     * - search by initials of class name
     *
     * cmd + [ = navigate back
    * */
}

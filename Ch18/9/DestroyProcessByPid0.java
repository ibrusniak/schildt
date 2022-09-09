
public class DestroyProcessByPid0 {

    public static void main(String[] args) throws Exception {
        
        if (args.length == 0) {
            System.out.println("Please specify PID!");
            return;
        }

        if (ProcessHandle.of(Integer.parseInt(args[0])).get().destroy())
            System.out.println("Process " + args[0] + " was destroyed.");
    }
}


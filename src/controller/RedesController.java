package controller;

public class RedesController {
        
    public RedesController() {
        super();
    }
    
    public String Sistema() {
        String Sistema = System.getProperty("os.name");
        return Sistema;
    }
    
    public void callProcess(String process) {
        try {
            Runtime.getRuntime().exec(process);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
        
}

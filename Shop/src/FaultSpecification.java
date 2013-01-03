
/* Η κλάση αναπαριστά την αιτιολογία για μια επιστροφή προϊόντος*/
public class FaultSpecification {

    private int code;
    private String description;

    public FaultSpecification(int code, String description) {
        this.code = code;
        this.description = description;
    }

   
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

   
    public int getCode() {
        return code;
    }

    
    public void setCode(int code) {
        this.code = code;
    }

}

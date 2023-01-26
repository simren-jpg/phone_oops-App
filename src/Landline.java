public class Landline implements Phone{

    String MyPhoneNo;
    boolean isRinging;
    boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.MyPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return MyPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        MyPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
     if(isPowerOn==true){
         System.out.println("You are dialing no:"+phoneNo);

     }else{
         System.out.println("Your Landline is off");
     }
     return;
    }

    @Override
    public void receiveCall(String phoneNo) {
       if(isPowerOn && MyPhoneNo.equals(phoneNo)){
           this.isRinging= true;
           System.out.println("Hi"+"," +MyPhoneNo+" "+"You are receiveing the call");
       }else{
           System.out.println("Power is off");
       }
       return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call Answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

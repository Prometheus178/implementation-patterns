package behavioral.template_method.networks;

public abstract class Network {

    protected String userName;
    protected String password;

    public Network() {
    }

    public boolean post(String message){
        if (login(this.userName,this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean login(String userName, String password);
    abstract boolean sendData(byte[] bytes) ;
    abstract void  logOut();

}

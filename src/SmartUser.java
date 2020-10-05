public class SmartUser {
    private SmartPhone phone;

    public SmartUser(SmartPhone phone){
        this.phone=phone;
    }

    void trunonthePhone(){
        this.phone.poweron();
    }
    void trunoffthephone(){
        this.phone.powerof();
    }

    void Phonelouder(){
        this.phone.volumeup();
    }
    void phonesilent(){
        this.phone.volumedown();
    }

}

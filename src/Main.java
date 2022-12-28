public class  Main {
    public static void main(String[] args) {
addmovie addmovie =new addmovie();
addmovie.createMovie();
customerUi customerUi = new customerUi();
customerUi.createCustomer();
login login =new login();
login.createLogin();
payment payment = new payment();
payment.createPayment();
register register = new register();
register.createRegister();
cancelpayment cancelpayment = new cancelpayment();
cancelpayment.createCancel();
    }
}
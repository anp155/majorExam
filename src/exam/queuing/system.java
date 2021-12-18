package exam.queuing;

//code copied from https://stackoverflow.com/questions/36116554/multithreading-in-java-bank-queue
    public class Customer {
        private int customerID;
        private int processTime;

        ArrayList<Integer> customerIDList = new ArrayList<>();
        ArrayList<Integer> processTimeList = new ArrayList<>();

        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;

        //code copied from https://stackoverflow.com/questions/36116554/multithreading-in-java-bank-queue
    public class Teller {

        private boolean status = true;

        public boolean isStatus() {
            return status;

}

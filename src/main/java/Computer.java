public class Computer {
    private int storage;
    private String printer_model;

    public Computer(int storage){
        this.storage = storage;
        this.printer_model = null;

    }

    public int currentStorage(){
        return this.storage;
    }

    public void setStorage(int newStorage){
        this.storage = newStorage;
    }

    public int getStorage(){
        return this.storage;
    }

    public void updatePrinterModel(String model){
        this.printer_model = model;
    }

    public String getPrinterModel(){
        return this.printer_model;
    }

    public void printMessage(){
        if (this.printer_model != null){
            System.out.println("Hello World!");
        }
    }

}

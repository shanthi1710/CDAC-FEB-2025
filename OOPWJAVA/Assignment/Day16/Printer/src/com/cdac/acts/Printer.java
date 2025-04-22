package com.cdac.acts;
import java.io.Serializable;
import java.time.LocalDate;
import com.cdac.acts.printerType.PrinterEnum;

public class Printer implements Serializable {
	
	private static final long serialVersionUID = -6869708415159830735L;
	private String serialNo;
	private String modelNo;
	private double price;
	private PrinterEnum printerType;
	private LocalDate manufacturingDate;
	
	public Printer(String serialNo, String modelNo, double price, PrinterEnum printerType,
			LocalDate manufacturingDate) {
		super();
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.printerType = printerType;
		this.manufacturingDate = manufacturingDate;
	}
	
	public String getSerialNo() {
        return serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PrinterEnum getPrinterType() {
        return printerType;
    }
	public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }
	 @Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", printerType="
					+ printerType + ", manufacturingDate=" + manufacturingDate + "]";
	 }		
}

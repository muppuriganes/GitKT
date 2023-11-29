interface SmartCardReader {
    void grantAccess(String employeeName);
}
class ConcreteSmartCardReader implements SmartCardReader {
    @Override
    public void grantAccess(String employeeName) {
        System.out.println("Granting access to employee: " + employeeName);
        // Simulated access granting process 
    }}
class SmartCardProxy implements SmartCardReader {
    private ConcreteSmartCardReader realReader;

    public SmartCardProxy() {
        this.realReader = new ConcreteSmartCardReader();}

    @Override
    public void grantAccess(String employeeName) {
        System.out.println("Proxy: Access request for employee: " + employeeName);
        realReader.grantAccess(employeeName);
        // Logging access
        System.out.println("Logging access for employee: " + employeeName);
    }}
public class Proxy {
    public static void main(String[] args) {
        SmartCardReader smartCardProxy = new SmartCardProxy();

        smartCardProxy.grantAccess("John Doe"); // Employee tries to gain access through the proxy
        smartCardProxy.grantAccess("Alice Smith");
    }
}

package com.mycompany.yunus_emre_dogan_hw2;

/**
 *
 * @author ynsmr
 */
public class Inventory implements InventoryInterface {
    private Device head;

    public Inventory() {
        head = null;
    }

    private Device findDevice(String name, String type, String value) {
        Device current = head;
        while (current != null) {
            if (current.getName().equals(name) &&
                current.getType().equals(type) &&
                current.getValue().equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Cihaz ekleme metotlari
    @Override
    public void addResistor(String val, Integer cnt) {
        addDevice("Resistor", val, "-", cnt);
    }

    @Override
    public void addCapacitor(String val, String typ, Integer cnt) {
        addDevice("Capacitor", val, typ, cnt);
    }

    @Override
    public void addInductor(String val, Integer cnt) {
        addDevice("Inductor", val, "-", cnt);
    }

    @Override
    public void addTransistor(String typ, Integer cnt) {
        addDevice("Transistor", "-", typ, cnt);
    }

    public void addDevice(String name, String value, String type, Integer count) {
        Device existingDevice = findDevice(name, type, value);
        if (existingDevice != null) {
            existingDevice.setCount(existingDevice.getCount() + count);
        } else {
            Device newDevice = new Device(name, type, value, count);
            if (head == null || head.getName().compareTo(name) > 0) {
                newDevice.next = head;
                head = newDevice;
            } else {
                Device current = head;
                while (current.next != null && current.next.getName().compareTo(name) < 0) {
                    current = current.next;
                }
                newDevice.next = current.next;
                current.next = newDevice;
            }
        }
    }

    // Cihaz silme metotlari
    @Override
    public int deleteResistor(String val, Integer cnt) {
        return deleteDevice("Resistor", val, "-", cnt);
    }

    @Override
    public int deleteCapacitor(String val, String typ, Integer cnt) {
        return deleteDevice("Capacitor", val, typ, cnt);
    }

    @Override
    public int deleteInductor(String val, Integer cnt) {
        return deleteDevice("Inductor", val, "-", cnt);
    }

    @Override
    public int deleteTransistor(String typ, Integer cnt) {
        return deleteDevice("Transistor", "-", typ, cnt);
    }

    private int deleteDevice(String name, String value, String type, Integer count) {
        Device current = head;
        Device previous = null;

        while (current != null) {
            if (current.getName().equals(name) && current.getType().equals(type) &&
                current.getValue().equals(value)) {
                if (current.getCount() >= count) {
                    current.setCount(current.getCount() - count);
                    if (current.getCount() == 0) {
                        if (previous == null) {
                            head = current.next;
                        } else {
                            previous.next = current.next;
                        }
                    }
                    return current.getCount();
                } else {
                    return -1;
                }
            }
            previous = current;
            current = current.next;
        }
        return -1;
    }

    // Bağli listeyi secilen siraya gore siralayan metot (Elle Siralama - Bubble Sort)
    private void sortInventory(boolean sortByCount) {
        if (head == null || head.next == null) return;
        
        boolean swapped;
        do {
            swapped = false;
            Device current = head;
            Device prev = null;

            while (current.next != null) {
                Device next = current.next;
                boolean condition = sortByCount ? (current.getCount() > next.getCount())
                                                : (current.getName().compareTo(next.getName()) > 0);
                
                if (condition) {
                    // Swap işlemi
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;
                    swapped = true;
                }
                
                prev = current;
                current = current.next;
            }
        } while (swapped);
    }

    // Envanteri yazdirma
    @Override
    public void printInventory(boolean sortByCount) {
        sortInventory(sortByCount);  // Listeyi elle siraliyoruz (Bubble Sort ile)
        
        Device current = head;
        while (current != null) {
            System.out.println(current.getName() + " - Type: " + current.getType() + 
                               ", Value: " + current.getValue() + ", Count: " + current.getCount());
            current = current.next;
        }
    }
}
